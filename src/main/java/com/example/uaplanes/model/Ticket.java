package com.example.uaplanes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ticket_id;

    private Integer flight_id;
    private Integer user_profile_id;
    private String pnr;
    private String created_at;

    public Ticket() {
    }
}
