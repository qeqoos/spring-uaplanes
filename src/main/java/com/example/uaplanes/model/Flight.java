package com.example.uaplanes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer flight_id;

    private Integer departure_city_id;
    private Integer arrival_city_id;
    private String departure_time;
    private String arrival_time;
    private Integer flight_number;
    private Double price;
    private String created_at;

    public Flight() {
    }

    public Flight(Integer flight_id, Integer departure_city_id, Integer arrival_city_id, String departure_time, String arrival_time, Integer flight_number, Double price, String created_at) {
        this.flight_id = flight_id;
        this.departure_city_id = departure_city_id;
        this.arrival_city_id = arrival_city_id;
        this.departure_time = departure_time;
        this.arrival_time = arrival_time;
        this.flight_number = flight_number;
        this.price = price;
        this.created_at = created_at;
    }

    public Integer getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(Integer flight_id) {
        this.flight_id = flight_id;
    }

    public Integer getDeparture_city_id() {
        return departure_city_id;
    }

    public void setDeparture_city_id(Integer departure_city_id) {
        this.departure_city_id = departure_city_id;
    }

    public Integer getArrival_city_id() {
        return arrival_city_id;
    }

    public void setArrival_city_id(Integer arrival_city_id) {
        this.arrival_city_id = arrival_city_id;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public Integer getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(Integer flight_number) {
        this.flight_number = flight_number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
