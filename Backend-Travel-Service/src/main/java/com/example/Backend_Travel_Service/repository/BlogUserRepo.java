package com.example.Backend_Travel_Service.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.Backend_Travel_Service.user.BlogUser;

@Repository
@Transactional(readOnly = true)
public interface BlogUserRepo {
    Optional<BlogUser> findByEmail(String email);
}
