package com.example.springdatajpa.dto;

import lombok.*;

import java.io.Serializable;


@Setter
@Getter
public class UserDto implements Serializable {
    private String Email;
    private String UserName;
    private String PassWord;

    public UserDto(String email, String userName, String passWord) {
        Email = email;
        UserName = userName;
        PassWord = passWord;
    }

    public UserDto() {

    }

    public String getPassWord() {

        return null;
    }


}
