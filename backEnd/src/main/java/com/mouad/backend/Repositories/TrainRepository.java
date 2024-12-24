package com.mouad.backend.Repositories;

import com.mouad.backend.Models.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TrainRepository extends JpaRepository<Train, Long> {
    @Query("SELECT t FROM Train t WHERE t.fromStation = :from AND t.toStation = :to " +
           "AND DATE(t.departureTime) = DATE(:date) AND t.bookedSeats < t.totalSeats")
    List<Train> findAvailableTrains(String from, String to, LocalDateTime date);
    
    Train findByTrainId(String trainId);
}
