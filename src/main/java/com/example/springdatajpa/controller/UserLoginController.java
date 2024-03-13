package com.example.springdatajpa.controller;

import com.example.springdatajpa.Service.UserService;
import com.example.springdatajpa.dto.UserDto;
import com.example.springdatajpa.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.awt.event.MouseEvent;

@Controller
@AllArgsConstructor
@SessionAttributes("userdto")
public class UserLoginController {

    private UserService userService;
    @ModelAttribute("userdto")
    public UserDto userDto(){
        return new UserDto();
    }

    @GetMapping("/login")
    public String showLoginForm(){
        return "/login";
    }

    @PostMapping("/login")
    public String Login(@ModelAttribute("userDto")UserDto userDto, Model model){
        if (userService.checkUserbyEmail(userDto.getEmail()) == false){
            return "redirect:/login?emailwrong";
        }
        if (userService.checkPasswordUser(userDto.getEmail(), userDto.getPassWord())){
            return "redirect:/home?success";
        }
        return "redirect:/login?passwordwrong";

    }
}
