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

    private static final String USERS_PATH = "app/src/main/java/org.example.app/localDB/userData.json";


    public UserBookingServices(User user1) throws IOException { // It manages the try catch scenarios
    this.user = user1;
    File users = new File(USERS_PATH);
    userList = objectMapper.readValue(users,new TypeReference<List<User>>() {});
    }


    //Method to login user
    public Boolean loginUser(User user1){
        Optional<User> foundUser = userList.stream().filter(user1 ->{
            return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(),user1)
        }).findFirst();
        return foundUser.isPresent();
    }

    //Method to signUp a new user
    public Boolean signUp(User user1){
        try{
            userList.add(user1);
            saveUserListToFile();
            return Boolean.TRUE;
        }
        catch(IOException ex){
            return Boolean.FALSE;
        }
    }

}
