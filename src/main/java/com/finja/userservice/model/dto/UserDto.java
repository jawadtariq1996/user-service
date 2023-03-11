package com.finja.userservice.model.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class UserDto{
    private UUID userId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String userName;
    private String email;
    private String countryCode;
    private String mobileNumber;
    private LocalDateTime createdAt;
}