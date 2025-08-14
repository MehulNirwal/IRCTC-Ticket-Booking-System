package org.example.app.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.app.entities.User;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
public class UserBookingServices {

    private User user;

    private List<User> userList;

    private ObjectMapper objectMapper = new ObjectMapper();  // it maps the entities of json files into camelcase

    private static final String USERS_PATH = "../localDB/userData.json";


    public UserBookingServices(User user1) throws IOException {
    this.user = user1;
    File users = new File(USERS_PATH);
    userList = objectMapper.readValue(users,new TypeReference<List<User>>() {});
    }
}
