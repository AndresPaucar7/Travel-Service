package com.example.Backend_Travel_Service.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.Backend_Travel_Service.repository.BlogUserRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BlogUserService implements UserDetailsService{

    private final BlogUserRepo blogUserRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException
    {
        return blogUserRepo.findByEmail(email)
        .orElseThrow(() -> new UsernameNotFoundException("Email Not Found"));
    }
    
}
