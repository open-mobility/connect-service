package com.o4.open.connect.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {

    @NotEmpty
    private Channel channel;
    @NotEmpty
    private String service;
    @NotNull
    private String userId;
    @NotEmpty
    private String userType;
    @NotEmpty
    private String action;
    @NotEmpty
    private String message;
    private String subject;
}
