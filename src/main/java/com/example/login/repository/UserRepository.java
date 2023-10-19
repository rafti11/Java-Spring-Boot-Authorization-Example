package com.example.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.login.model.user.User;


public interface UserRepository extends JpaRepository<User, Integer>{

    Optional<User> findByEmail(String email);
    
}
