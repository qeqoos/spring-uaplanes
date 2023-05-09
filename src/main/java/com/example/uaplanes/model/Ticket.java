package com.example.uaplanes.model;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ticket_id")
    private Integer ticketId;

    @Column(name = "flight_id")
    private Integer flightId;

    @Column(name = "user_profile_id")
    private Integer userProfileId;

    @Column(name = "pnr")
    private String pnr;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    public Ticket() {
    }

    public Ticket(Integer ticketId, Integer flightId, Integer userProfileId, String pnr, OffsetDateTime createdAt) {
        this.ticketId = ticketId;
        this.flightId = flightId;
        this.userProfileId = userProfileId;
        this.pnr = pnr;
        this.createdAt = createdAt;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public Integer getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(Integer userProfileId) {
        this.userProfileId = userProfileId;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
