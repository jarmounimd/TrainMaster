package com.mouad.backend.Models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @ManyToOne
    @JoinColumn(name = "train_id", nullable = false)
    private Train train;
    
    private Integer numSeats;
    private Double totalPrice;
    private LocalDateTime bookingTime;
    
    public Booking() {
        this.bookingTime = LocalDateTime.now();
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public User getUser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    public Train getTrain() {
        return train;
    }
    
    public void setTrain(Train train) {
        this.train = train;
    }
    
    public Integer getNumSeats() {
        return numSeats;
    }
    
    public void setNumSeats(Integer numSeats) {
        this.numSeats = numSeats;
    }
    
    public Double getTotalPrice() {
        return totalPrice;
    }
    
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public LocalDateTime getBookingTime() {
        return bookingTime;
    }
    
    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }
}
