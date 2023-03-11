package com.finja.userservice.mapper;

import com.finja.userservice.model.dto.UserDto;
import com.finja.userservice.model.entity.User;

public class UserMapper {

    public static UserDto toUser(User user){

      return UserDto.builder()
              .userId(user.getUserId())
              .firstName(user.getFirstName())
              .middleName(user.getMiddleName())
              .lastName(user.getLastName())
              .userName(user.getUserName())
              .email(user.getEmail())
              .countryCode(user.getCountryCode())
              .mobileNumber(user.getMobileNumber())
              .createdAt(user.getCreated_at()).build();
    }
}
