package org.example.app.entities;

import java.util.List;

public class User {
    private String userName;

    private String password;

    private String hashedPassword;

    private List<Ticket> ticketBooked;

    private String userId;

    public User(String userName, String password, String hashedPassword, List<Ticket> ticketBooked, String userId) {
        this.userName = userName;
        this.password = password;
        this.hashedPassword = hashedPassword;
        this.ticketBooked = ticketBooked;
        this.userId = userId;
    }
    public User(){}

    public String getName() {
        return userName;
    }

    public String getPassword(){
        return password;
    }

    public String getHashedPassword(){
        return hashedPassword;
    }

    public List<Ticket> getTicketBooked(){
        return ticketBooked;
    }

    public void printTickets(){
        for(int i=0;i<ticketBooked.size();i++){
           System.out.println(ticketBooked.get(i).getTicketInfo());
        }
    }

    public String getUserId(){
        return userId;
    }

    public void setName(String userNme){
        this.userName=userName;
    }

    public void setHashedPassword(String hashedPassword){
        this.hashedPassword=hashedPassword;
    }

    public String getpassword(){
        return password;
    }

}

