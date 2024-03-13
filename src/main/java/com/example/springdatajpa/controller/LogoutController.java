package com.example.springdatajpa.controller;

import com.example.springdatajpa.dto.UserDto;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

@Controller
@AllArgsConstructor
@SessionAttributes("user")
public class LogoutController {
    @ModelAttribute("user")
    public UserDto userDto(){
        return new UserDto();
    }

    @GetMapping("/logout")
    public String Logout (@ModelAttribute("user")UserDto userDto, WebRequest request, SessionStatus Status){

        Status.setComplete();
        request.removeAttribute("user", WebRequest.SCOPE_REQUEST);
        
            return "redirect:/login";
    }
}
