package com.umang.togadiya.springbootmaven.service;

import com.umang.togadiya.springbootmaven.model.UserModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getWelcomeInformation() {
        return "Welcome to Spring Boot Maven Demo";
    }

    public UserModel getUserInformation() {
        final UserModel oneUser = UserModel.builder().name("Umang").email("umang@gmail.com").build();
        return oneUser;
    }
}
