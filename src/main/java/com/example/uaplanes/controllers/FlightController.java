//package com.example.uaplanes.controllers;
//
//import com.example.uaplanes.model.Flight;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//@RestController
//public class FlightController {
//
//    private static List<Flight> Flights = new ArrayList<>();
//    private static Integer currentId = 1;
//
//    @GetMapping("/api/flights")
//    public List<Flight> getAllFlights() {
//        return Flights;
//    }
//
//    @GetMapping("/api/flights/{id}")
//    public List<Flight> getFlightById(@PathVariable int id) {
//        return Flights.stream().filter(obj -> obj.getId() == id).toList();
//    }
//
//    @PostMapping(value = "/api/flights/add", produces = "application/json", consumes = "application/json" )
//    @ResponseStatus(code = HttpStatus.CREATED)
//    public String addFlight(@RequestBody Flight f) {
//        f.setId(currentId);
//        Flights.add(f);
//        currentId += 1;
//        return "Added Flight with id: " + f.getId();
//    }
//
//    @DeleteMapping("/api/flights/{id}")
//    @ResponseStatus(code = HttpStatus.NO_CONTENT)
//    public String deleteFlightById(@PathVariable int id) {
//        Flights.removeIf(obj -> obj.getId() == id);
//        return "Deleted Flight with id " + id;
//    }
//}
