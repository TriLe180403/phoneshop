package com.example.springdatajpa.Service;

import com.example.springdatajpa.dto.UserDto;
import com.example.springdatajpa.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void save(UserDto userDto);
    Boolean checkPasswordUser(String email, String Password);
    Boolean checkUserbyEmail(String email);
    User getUserbyEmail(String email);
}
