package com.example.uaplanes.controllers;

import com.example.uaplanes.model.Ticket;
import com.example.uaplanes.repository.TicketRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TicketController {
    private final TicketRepository ticketRepository;

    public TicketController(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @GetMapping("/api/tickets")
    public ResponseEntity getAllTickets() {
        return ResponseEntity.ok(this.ticketRepository.findAll());
    }

    @GetMapping("/api/tickets/{id}")
    public ResponseEntity getUserById(@PathVariable int id) {
        return ResponseEntity.ok(this.ticketRepository.findById(id));
    }

    @PostMapping(value = "/api/tickets/add", produces = "application/json", consumes = "application/json" )
    public ResponseEntity createTicket(@RequestBody Ticket ticket) {
        return ResponseEntity.ok(this.ticketRepository.save(ticket));
    }
}
