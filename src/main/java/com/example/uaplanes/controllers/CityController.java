package com.example.uaplanes.controllers;

import com.example.uaplanes.repository.CityRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    private final CityRepository cityRepository;

    public CityController(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping("/api/cities")
    public ResponseEntity getAllCities() {
        return ResponseEntity.ok(this.cityRepository.findAll());
    }
}
