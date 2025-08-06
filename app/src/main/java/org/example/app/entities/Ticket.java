package org.example.app.entities;

import java.time.LocalDateTime;
import java.util.Date;

public class Ticket {

    private String ticketId;

    private String userId;

    private String source;

    private String destination;

    private int totalFare;

    private LocalDateTime dateOfTravel;

    private Train train;
}
