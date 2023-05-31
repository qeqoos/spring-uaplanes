package com.example.uaplanes.service;

import com.example.uaplanes.model.userProfile;
import com.example.uaplanes.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) { this.userRepository = userRepository; }

    public List<userProfile> getAllUsers() { return userRepository.findAll(); }

    public Optional<userProfile> getUserById(int id) { return userRepository.findById(id); }
}
