package com.o4.open.connect.api;

import com.o4.open.connect.dto.BooleanResponse;
import com.o4.open.connect.dto.ChangeRequest;
import com.o4.open.connect.dto.Channel;
import com.o4.open.connect.dto.Subscriber;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/subscription")
public interface SubscriptionApi {

    @PostMapping("/subscribe")
    Subscriber subscribe(@RequestBody Subscriber subscriber);

    @PutMapping("/un-subscribe/{subscriptionId}/{channel}")
    BooleanResponse unsubscribe(@PathVariable("subscriptionId") Long subscriptionId, @PathVariable("channel") Channel channel);

    @PutMapping("/un-subscriber-user")
    BooleanResponse unsubscribe(@RequestBody ChangeRequest request);

    @PutMapping("/block")
    BooleanResponse block(@RequestBody ChangeRequest request);
}
