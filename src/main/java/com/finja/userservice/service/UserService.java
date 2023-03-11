package com.finja.userservice.service;

import com.finja.userservice.model.dto.UserDto;

public interface UserService {

    UserDto getUser(String userId);
}
