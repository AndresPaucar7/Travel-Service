package com.example.Backend_Travel_Service.controller;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend_Travel_Service.registration.EmailRequest;
import com.example.Backend_Travel_Service.service.EmailService;

@RestController
@RequestMapping(path = "api/v1/requestsignup")
@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
public class SignUpRequestController   {

    private final EmailService emailService;

    @PostMapping
    public String requestSignUp(@RequestBody EmailRequest emailRequest) {
        emailService.sendSignUpLink(emailRequest.getEmail());
        return "Sign-up link sent to " + emailRequest.getEmail();
    }
}
