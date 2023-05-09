package com.example.uaplanes.controllers;

import com.example.uaplanes.service.CityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/api/cities")
    public ResponseEntity getAllCities() {
        return ResponseEntity.ok(this.cityService.getAllCities());
    }
}
