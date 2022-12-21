package com.example.uaplanes;

public class Flight {
    int id;
    int flightNumber;
    double price;
    String creationDate;
    String departure;
    String arrival;
    String departureDateTime;
    String arrivalDateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Flight() {
        id = 1;
        flightNumber = 228;
        price = 133.7;
        creationDate = "20.12.22 - 11:03";
        departure = "Alabama";
        arrival = "San-Paulo";
        departureDateTime = "22.12.22 - 6:30";
        arrivalDateTime = "22.12.22 - 10:00";
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", flightNumber=" + flightNumber +
                ", price=" + price +
                ", creationDate='" + creationDate + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", departureDateTime='" + departureDateTime + '\'' +
                ", arrivalDateTime='" + arrivalDateTime + '\'' +
                '}';
    }
}
