package org.example.app.entities;


import java.time.LocalDateTime;

public class Train {

    private int trainNo;

    private String trainId;

    private String source;

    private String destination;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    private List<List<Integer>> seats;

    private HashMap<String,LocalDateTime> inRouteStations;
}
