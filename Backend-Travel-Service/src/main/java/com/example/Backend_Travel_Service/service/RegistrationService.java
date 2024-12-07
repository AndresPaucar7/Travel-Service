package com.example.Backend_Travel_Service.service;

import org.springframework.stereotype.Service;

import com.example.Backend_Travel_Service.registration.RegistrationRequest;
import com.example.Backend_Travel_Service.user.BlogUser;


@Service
public class RegistrationService {
    
    private final BlogUserService blogUserService;

    public RegistrationService(BlogUserService blogUserService){
        this.blogUserService = blogUserService;
    }

    public String register(RegistrationRequest request) {
        return blogUserService.signUpUser(
            new BlogUser(
                request.getFirstName(),
                request.getLastName(),
                request.getEmail(),
                request.getPassword()
            )
        );
    }
    
}
