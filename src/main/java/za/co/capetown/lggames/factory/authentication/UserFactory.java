package za.co.capetown.lggames.factory.authentication;

import za.co.capetown.lggames.domain.Name;
import za.co.capetown.lggames.domain.authentication.Role;
import za.co.capetown.lggames.domain.authentication.User;

public class UserFactory {
    public static User registerUser(String userId, Name name,
                                    String userName, String email,
                                    String phoneNumber, String password,
                                    Role role){
        return new User.Builder()
                .setUserId(userId)
                .setName(name)
                .setUserName(userName)
                .setEmail(email)
                .setPhoneNumber(phoneNumber)
                .setPassword(password)
                .setRole(role)
                .build();
    }

    public static User loginUser(String userName, String password){
        return new User.Builder()
                .setUserName(userName)
                .setPassword(password)
                .build();
    }
}
