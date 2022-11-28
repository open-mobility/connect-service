package com.o4.open.connect.api;

import com.o4.open.connect.dto.Message;
import com.o4.open.connect.dto.MessageStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/gateway")
public interface GatewayApi {

    @PostMapping("/send")
    MessageStatus send(Message message);

    @GetMapping("/status/{messageId}")
    MessageStatus status(@PathVariable("messageId") Long messageId);

    @PutMapping("/retry/{messageId}")
    MessageStatus retry(@PathVariable("messageId") Long messageId);
}
