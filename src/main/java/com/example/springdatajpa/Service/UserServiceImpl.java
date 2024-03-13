package com.example.springdatajpa.Service;

import com.example.springdatajpa.dto.UserDto;
import com.example.springdatajpa.model.User;
import com.example.springdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;
    

    @Override
    public void save(UserDto userDto){
        User user;
        user = new User(userDto.getEmail(), userDto.getUserName(), userDto.getEmail(), userDto.getPassWord());
        userRepository.save(user);
    }

    @Override
    public Boolean checkPasswordUser(String email, String Password) {
        User user;
        user = userRepository.findUserByEmail(email);
        if (user.getPassWord().equals(Password)) return true;
        return false;
    }

    @Override
    public Boolean checkUserbyEmail(String email) {
        User user = userRepository.findUserByEmail(email);
        if (user == null) return false;
        return true;
    }

    @Override
    public User getUserbyEmail(String email) {
        return userRepository.getUserByEmail(email);
    }

}
