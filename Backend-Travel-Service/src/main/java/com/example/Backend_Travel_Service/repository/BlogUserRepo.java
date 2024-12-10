package com.example.Backend_Travel_Service.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.Backend_Travel_Service.user.BlogUser;

@Repository
@Transactional(readOnly = true)
public interface BlogUserRepo extends JpaRepository<BlogUser, Long> {
    Optional<BlogUser> findByEmail(String email);
}
