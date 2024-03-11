package com.example.springdatajpa.dto;

import lombok.*;

import java.io.Serializable;


@Setter
@Getter
public class UserDto implements Serializable {
    private String Email;
    private String UserName;
    private String PassWork;

    public UserDto(String email, String userName, String passWork) {
        Email = email;
        UserName = userName;
        PassWork = passWork;
    }

    public UserDto() {

    }
}
