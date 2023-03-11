package com.finja.userservice.controller;

import com.finja.userservice.model.dto.UserDto;
import com.finja.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user/{userId}")
    public ResponseEntity<UserDto> getUser(@PathVariable String userId){

        UserDto userDto = userService.getUser(userId);
        return ResponseEntity.ok(userDto);
    }
}
