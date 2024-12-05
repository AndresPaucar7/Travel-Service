package com.example.Backend_Travel_Service.service;

import org.springframework.stereotype.Service;

import com.example.Backend_Travel_Service.registration.RegistrationRequest;


@Service
public class RegistrationService {

    public String register(RegistrationRequest request) {
        return "works";
    }
    
}
