package com.mouad.backend.Models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "trains")
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String trainId;
    private String fromStation;
    private String toStation;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Double price;
    private Integer totalSeats;
    private Integer bookedSeats;
    
    public Train() {}
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTrainId() {
        return trainId;
    }
    
    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }
    
    public String getFromStation() {
        return fromStation;
    }
    
    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }
    
    public String getToStation() {
        return toStation;
    }
    
    public void setToStation(String toStation) {
        this.toStation = toStation;
    }
    
    public LocalDateTime getDepartureTime() {
        return departureTime;
    }
    
    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }
    
    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }
    
    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    
    public Double getPrice() {
        return price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    public Integer getTotalSeats() {
        return totalSeats;
    }
    
    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }
    
    public Integer getBookedSeats() {
        return bookedSeats;
    }
    
    public void setBookedSeats(Integer bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
    
    public Integer getAvailableSeats() {
        return totalSeats - bookedSeats;
    }
}
