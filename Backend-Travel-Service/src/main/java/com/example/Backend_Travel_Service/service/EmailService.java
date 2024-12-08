package com.example.Backend_Travel_Service.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendSignUpLink(String userEmail){
        SimpleMailMessage message = new SimpleMailMessage();
        System.out.println("Here");
        message.setTo(userEmail);
        message.setSubject("Sign Up Here");
        message.setText("Click here to sign up \n" + 
                        "http://localhost:8000/api/v1/registration");

        mailSender.send(message);
    }
}
