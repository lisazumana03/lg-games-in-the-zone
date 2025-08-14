package za.co.capetown.lggames.factory.authentication;

import org.junit.jupiter.api.Test;
import za.co.capetown.lggames.domain.Name;
import za.co.capetown.lggames.domain.authentication.Role;
import za.co.capetown.lggames.domain.authentication.User;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {

    @Test
    void registerUser() {
        String userId = "0902";
        Name name = new Name.Builder()
                .setFirstName("John")
                .setLastName("Doe")
                .build();
        String setUserName = name.toString();
        String email = "test@gmail.com";
        String phoneNumber = "021-232-4444";
        String password = "password";
        Role role = Role.USER;

        User user = UserFactory.registerUser(userId, name, setUserName, email, phoneNumber, password, role);
        assertNotNull(user);
        System.out.println("User registered: " + user);
    }

    @Test
    void loginUser() {
        String userName = "user";
        String password = "password";

        User user = UserFactory.loginUser(userName, password);

        assertNotNull(user);
        System.out.println("User login: " + user);
    }
}