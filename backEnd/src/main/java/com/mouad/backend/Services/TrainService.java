package com.mouad.backend.Services;

import com.mouad.backend.Models.Train;
import com.mouad.backend.Repositories.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

@Service
public class TrainService {
    @Autowired
    private TrainRepository trainRepository;
    
    public List<Map<String, Object>> searchTrains(String from, String to, LocalDate date) {
        LocalDateTime startOfDay = date.atStartOfDay();
        LocalDateTime endOfDay = date.atTime(LocalTime.MAX);
        
        List<Train> trains = trainRepository.findAvailableTrains(from, to, startOfDay);
        List<Map<String, Object>> results = new ArrayList<>();
        
        for (Train train : trains) {
            Map<String, Object> trainMap = new HashMap<>();
            trainMap.put("trainId", train.getTrainId());
            trainMap.put("departure", train.getDepartureTime().toString());
            trainMap.put("arrival", train.getArrivalTime().toString());
            trainMap.put("duration", calculateDuration(train.getDepartureTime(), train.getArrivalTime()));
            trainMap.put("price", train.getPrice());
            trainMap.put("availableSeats", train.getAvailableSeats());
            results.add(trainMap);
        }
        
        return results;
    }
    
    public List<String> getAllStations() {
        Set<String> stations = new HashSet<>();
        List<Train> allTrains = trainRepository.findAll();
        
        for (Train train : allTrains) {
            stations.add(train.getFromStation());
            stations.add(train.getToStation());
        }
        
        List<String> stationList = new ArrayList<>(stations);
        Collections.sort(stationList);
        return stationList;
    }
    
    public Train getTrainById(String trainId) {
        return trainRepository.findByTrainId(trainId);
    }
    
    public boolean updateTrainSeats(String trainId, int seatsToBook) {
        Train train = trainRepository.findByTrainId(trainId);
        if (train != null && train.getAvailableSeats() >= seatsToBook) {
            train.setBookedSeats(train.getBookedSeats() + seatsToBook);
            trainRepository.save(train);
            return true;
        }
        return false;
    }
    
    private String calculateDuration(LocalDateTime departure, LocalDateTime arrival) {
        long minutes = java.time.Duration.between(departure, arrival).toMinutes();
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return String.format("%dh %02dm", hours, remainingMinutes);
    }
}
