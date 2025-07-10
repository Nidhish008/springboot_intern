package com.example.Springboot.controller;

import com.example.Springboot.model.RegisterDetails;
import com.example.Springboot.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @GetMapping
    public List<RegisterDetails> getRegisterDetails() {
        return authService.getRegisterDetails();
    }

    @PostMapping("/register")
    public String addNewUser(@RequestBody RegisterDetails register) {
        return authService.addNewUser(register);
    }

    @PostMapping("/login")
    public String Login(@RequestBody RegisterDetails login) {
        return authService.authenticate(login);
    }
}