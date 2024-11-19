package com.example.Backend_Travel_Service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String home()
    {
        return "Public Page";
    }

    @GetMapping("LoggedIn")
    public String loggedIn()
    {
        return "Logged in Home Page";
    }
}
