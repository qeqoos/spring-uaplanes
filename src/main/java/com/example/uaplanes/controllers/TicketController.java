package com.example.uaplanes.controllers;

import com.example.uaplanes.model.Ticket;
import com.example.uaplanes.repository.TicketRepository;
import com.example.uaplanes.service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/api/tickets")
    public ResponseEntity getAllTickets() {
        return ResponseEntity.ok(this.ticketService.getAllTickets());
    }

    @GetMapping("/api/tickets/{id}")
    public ResponseEntity getTicketById(@PathVariable int id) {
        return ResponseEntity.ok(this.ticketService.getTicketById(id));
    }

    @PostMapping(value = "/api/tickets/add", produces = "application/json", consumes = "application/json")
    public ResponseEntity createTicket(@RequestBody Ticket ticket) {
        return ResponseEntity.ok(this.ticketService.createTicket(ticket));
    }
}
