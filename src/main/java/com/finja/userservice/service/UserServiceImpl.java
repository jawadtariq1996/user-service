package com.finja.userservice.service;

import com.finja.userservice.mapper.UserMapper;
import com.finja.userservice.model.dto.UserDto;
import com.finja.userservice.model.entity.User;
import com.finja.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public UserDto getUser(String userId){

        Optional<User> user =  userRepository.findById(UUID.fromString(userId));
        return user.map(UserMapper::toUser).orElse(null);
    }
}
