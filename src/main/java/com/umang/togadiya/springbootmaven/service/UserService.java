package com.umang.togadiya.springbootmaven.service;

import com.umang.togadiya.springbootmaven.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getWelcomeInformation() {
        return "Welcome to Spring Boot Maven Demo";
    }

    public UserModel getUserInformation() {
        return UserModel.builder().name("Umang").email("umang@gmail.com").build();
    }
}
