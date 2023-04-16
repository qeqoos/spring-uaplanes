package com.example.uaplanes.controllers;

import com.example.uaplanes.model.Flight;
import com.example.uaplanes.repository.FlightRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FlightController {
    private final FlightRepository flightRepository;

    public FlightController(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @GetMapping("/api/flights")
    public ResponseEntity getAllFlights() {
        return ResponseEntity.ok(this.flightRepository.findAll());
    }

    @GetMapping("/api/flights/{id}")
    public ResponseEntity getFlightById(@PathVariable int id) {
        return ResponseEntity.ok(this.flightRepository.findById(id));
    }

    @PostMapping(value = "/api/flights/add", produces = "application/json", consumes = "application/json" )
    public ResponseEntity createFlight(@RequestBody Flight flight) {
        return ResponseEntity.ok(this.flightRepository.save(flight));
    }

    @DeleteMapping("/api/flights/{id}")
    public ResponseEntity deleteFlightById(@PathVariable int id) {
        this.flightRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
