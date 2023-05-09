package com.example.uaplanes.model;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "flight_id")
    private Integer flightId;

    @Column(name = "departure_city_id")
    private Integer departureCityId;

    @Column(name = "arrival_city_id")
    private Integer arrivalCityId;

    @Column(name = "departure_time")
    private OffsetDateTime departureTime;

    @Column(name = "arrival_time")
    private OffsetDateTime arrivalTime;

    @Column(name = "flight_number")
    private Integer flightNumber;

    @Column(name = "price")
    private Double price;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    public Flight() {
    }

    public Flight(Integer flightId, Integer departureCityId, Integer arrivalCityId, OffsetDateTime departureTime, OffsetDateTime arrivalTime, Integer flightNumber, Double price, OffsetDateTime createdAt) {
        this.flightId = flightId;
        this.departureCityId = departureCityId;
        this.arrivalCityId = arrivalCityId;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.flightNumber = flightNumber;
        this.price = price;
        this.createdAt = createdAt;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public Integer getDepartureCityId() {
        return departureCityId;
    }

    public void setDepartureCityId(Integer departureCityId) {
        this.departureCityId = departureCityId;
    }

    public Integer getArrivalCityId() {
        return arrivalCityId;
    }

    public void setArrivalCityId(Integer arrivalCityId) {
        this.arrivalCityId = arrivalCityId;
    }

    public OffsetDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(OffsetDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public OffsetDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(OffsetDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
