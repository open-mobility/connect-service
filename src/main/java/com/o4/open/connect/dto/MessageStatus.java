package com.o4.open.connect.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageStatus {
    private Long messageId;
    private SendStatus status;
}
