package com.example.kltntest.controller;

import com.example.kltntest.dto.request.UserCreationRequest;
import com.example.kltntest.entity.UserEntity;
import com.example.kltntest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/sign-up")
    UserEntity createUser(@RequestBody UserCreationRequest request) {
        return userService.createUser(request);
    }
}
