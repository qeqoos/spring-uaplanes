package com.example.uaplanes.controllers;

import com.example.uaplanes.repository.UserRepository;
import com.example.uaplanes.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/users")
    public ResponseEntity getAllUsers() {
        return ResponseEntity.ok(this.userService.getAllUsers());
    }

    @GetMapping("/api/users/{id}")
    public ResponseEntity getUserById(@PathVariable int id) {
        return ResponseEntity.ok(this.userService.getUserById(id));
    }
}
