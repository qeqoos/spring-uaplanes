package com.example.uaplanes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    public static int flights;

    @GetMapping("/")
    public String getIndex() {
        return "Welcome, this is home page of uaplanes!";
    }

    @GetMapping("/api/flights")
    public String getAllFlights() {
        return "all";
    }

    @GetMapping("/api/flights/{id}")
    public String getFlightById(@PathVariable String id) {
        return "Flight " + id;
    }
}
