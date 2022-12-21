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

    public Flight(int id, int flightNumber, double price, String creationDate, String departure, String arrival, String departureDateTime, String arrivalDateTime) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.price = price;
        this.creationDate = creationDate;
        this.departure = departure;
        this.arrival = arrival;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
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
