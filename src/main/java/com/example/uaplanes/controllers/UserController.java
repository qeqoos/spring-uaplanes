package com.example.uaplanes.controllers;

import com.example.uaplanes.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/api/users")
    public ResponseEntity getAllUsers() {
        return ResponseEntity.ok(this.userRepository.findAll());
    }

    @GetMapping("/api/users/{id}")
    public ResponseEntity getUserById(@PathVariable int id) {
        return ResponseEntity.ok(this.userRepository.findById(id));
    }
}
