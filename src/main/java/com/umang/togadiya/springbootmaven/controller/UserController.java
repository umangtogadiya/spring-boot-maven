package com.umang.togadiya.springbootmaven.controller;

import com.umang.togadiya.springbootmaven.model.UserModel;
import com.umang.togadiya.springbootmaven.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getWelcomeInfo() {
        return userService.getWelcomeInformation();
    }

    @GetMapping("/user")
    public UserModel getUserInfo() {
        return userService.getUserInformation();
    }
}
