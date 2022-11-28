package com.o4.open.connect.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Subscriber {
    /**
     * Optional field will be returned on success
     */
    private Long subscriptionId;
    @NotNull
    private String userId;
    @NotNull
    private String userType;
    @NotNull
    private Channel channel;
    @NotNull
    private String recipientAddress;
}
