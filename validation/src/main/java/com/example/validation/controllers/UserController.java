package com.example.validation.controllers;

import com.example.validation.request.LoginRequest;
import com.example.validation.request.RegisterRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/login")
    public LoginRequest login(@RequestBody @Valid LoginRequest loginRequest) {
        return loginRequest;
    }

    @PostMapping("/register")
    public RegisterRequest login(@RequestBody @Valid RegisterRequest registerRequest) {
        return registerRequest;
    }
}
