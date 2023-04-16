package com.example.uaplanes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.OffsetDateTime;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ticket_id;

    private Integer flight_id;
    private Integer user_profile_id;
    private String pnr;
    private OffsetDateTime created_at;

    public Ticket() {
    }

    public Ticket(Integer ticket_id, Integer flight_id, Integer user_profile_id, String pnr, OffsetDateTime created_at) {
        this.ticket_id = ticket_id;
        this.flight_id = flight_id;
        this.user_profile_id = user_profile_id;
        this.pnr = pnr;
        this.created_at = created_at;
    }

    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }

    public Integer getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(Integer flight_id) {
        this.flight_id = flight_id;
    }

    public Integer getUser_profile_id() {
        return user_profile_id;
    }

    public void setUser_profile_id(Integer user_profile_id) {
        this.user_profile_id = user_profile_id;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public OffsetDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(OffsetDateTime created_at) {
        this.created_at = created_at;
    }
}
