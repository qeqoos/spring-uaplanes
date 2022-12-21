package com.example.uaplanes;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class Controller {

    private static List<Flight> flights = new ArrayList<>();
    static {
        Flight f1 = new Flight();
        Flight f2 = new Flight();
        flights.add(f1);
        flights.add(f2);
    }

    @GetMapping("/api/flights")
    @ResponseBody
    public String getAllFlights() {
//        flightList.setFlights(flights);
        String response = "";
        for (Flight f:flights) {
            response += f.toString();
            response += "\n";
        }
        return response;
    }

    @GetMapping("/api/flights/{id}")
    public String getFlightById(@PathVariable int id) {
        return flights.get(id).toString();
    }

    @PostMapping("/api/flights/add")
    public String addFlight() {
        Flight f = new Flight();
        flights.add(f);
        return "Added flight: " + f.toString();
    }
}
