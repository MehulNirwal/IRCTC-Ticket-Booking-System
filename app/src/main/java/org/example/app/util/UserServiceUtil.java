package org.example.app.util;
// All the function which can be used in all the classes are stored in java.util package
import org.mindrot.jbcrypt.BCrypt;

public class UserServiceUtil {

    public static String hashPassword(String plainPassword){
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());

    }

    public static boolean checkPassword(String plainPassword, String hashedPassword){
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }
}
