package com.example.uaplanes;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class Controller {

    private static List<Flight> flights = new ArrayList<>();
    private static Integer currentId = 1;
    static {
        Flight f = new Flight();
        f.setId(1);
        f.setFlightNumber(228);
        f.setPrice(12.3);
        f.setCreationDate("20.12.22 - 11:03");
        f.setDeparture("Alabama");
        f.setArrival("San-Paulo");
        f.setDepartureDateTime("22.12.22 - 6:30");
        f.setArrivalDateTime("22.12.22 - 10:00");
        flights.add(f);
        currentId += f.getId();
    }

    @GetMapping("/api/flights")
    public List<Flight> getAllFlights() {
        return flights;
    }

    @GetMapping("/api/flights/{id}")
    public List<Flight> getFlightById(@PathVariable int id) {
        return flights.stream().filter(obj -> obj.getId() == id).toList();
    }

    @GetMapping("/api/argo")
    public String getSecretMessage() {
        return "Updated with Argo";
    }

    @PostMapping(value = "/api/flights/add", produces = "application/json", consumes = "application/json" )
    @ResponseStatus(code = HttpStatus.CREATED)
    public String addFlight(@RequestBody Flight f) {
        f.setId(currentId);
        flights.add(f);
        currentId += 1;
        return "Added flight with id: " + f.getId();
    }

    @DeleteMapping("/api/flights/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public String deleteFlightById(@PathVariable int id) {
        flights.removeIf(obj -> obj.getId() == id);
        return "Deleted flight with id " + id;
    }
}
