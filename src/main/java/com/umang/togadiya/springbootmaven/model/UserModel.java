package com.umang.togadiya.springbootmaven.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class UserModel {

    private String name;
    private String email;
}
