package org.example.app.entities;


import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

public class Train {

    private int trainNo;

    private String trainId;

    private String source;

    private String destination;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    private List<List<Integer>> seats;

    private String trainName;

    private HashMap<String,LocalDateTime> inRouteStations;
}
