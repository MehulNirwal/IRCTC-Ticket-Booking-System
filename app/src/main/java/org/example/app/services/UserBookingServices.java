package org.example.app.services;

import org.example.app.entities.User;
import java.util.ArrayList;

public class UserBookingServices {

    private User user;

    private List<User> userList;

    private ObjectMapper objectMapper = new ObjectMapper();

    private static final String USERS_PATH = "../localDB/userData.json";


    public UserBookingServices(User user1){
    this.user = user1;
    File users = new File(USERS_PATH);
    userList = objectMapper.readValue(users,new TypeReference<List<User>>() {});
    }
}
