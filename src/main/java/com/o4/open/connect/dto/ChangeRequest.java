package com.o4.open.connect.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangeRequest {
    @NotEmpty
    private String userId;
    @NotEmpty
    private String userType;
    @NotEmpty
    private String reason;
}
