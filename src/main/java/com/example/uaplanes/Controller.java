package com.example.uaplanes;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class Controller {

    private static List<Flight> flights = new ArrayList<>();
    private static Integer currentId = 1;
    static {
        Flight f = new Flight();
        flights.add(f);
        currentId += f.getId();
    }

    @GetMapping("/api/flights")
    @ResponseBody
    public String getAllFlights() {
        String response = "";
        for (Flight f:flights) {
            response += f.toString();
            response += "\n";
        }
        return response;
    }

    @GetMapping("/api/flights/{id}")
    public String getFlightById(@PathVariable int id) {
        return flights.get(id - 1).toString();
    }

    @PostMapping("/api/flights/add")
    public String addFlight() {
        Flight f = new Flight();
        f.id = currentId;
        f.flightNumber = 123;
        f.price = 13.7;
        f.creationDate = "21.12.22 - 16:02";
        f.departure = "Alaska";
        f.arrival = "Stockholm";
        f.departureDateTime = "23.12.22 - 22:30";
        f.arrivalDateTime = "24.12.22 - 10:00";
        flights.add(f);
        currentId += 1;
        return "Added flight: " + f.toString();
    }

    @DeleteMapping("/api/flights/{id}")
    public String deleteFlightById(@PathVariable int id) {
        flights.removeIf(obj -> obj.getId() == id);
        return "Deleted flight with id " + id;
    }
}
