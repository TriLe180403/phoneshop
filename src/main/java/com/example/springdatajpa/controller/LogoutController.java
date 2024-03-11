package com.example.springdatajpa.controller;

import com.example.springdatajpa.dto.UserDto;
import com.example.springdatajpa.model.User;
import lombok.AllArgsConstructor;
import org.springframework.http.ReactiveHttpOutputMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

@Controller
@AllArgsConstructor
@SessionAttributes("userdto")
public class LogoutController {
    @ModelAttribute("userdto")
    public UserDto userDto(){
        return new UserDto();
    }

    @GetMapping("/logout")
    public String Logout (@ModelAttribute("userdto")UserDto userDto, WebRequest request, SessionStatus Status){

        Status.setComplete();
        request.removeAttribute("userdto", WebRequest.SCOPE_REQUEST);
        
            return "redirect:/login";
    }
}
