package za.co.capetown.lggames.controller.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.capetown.lggames.domain.authentication.User;
import za.co.capetown.lggames.service.authentication.IUserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userService.registerUser(user);
        return "Registration successful!";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        boolean authenticated = userService.authenticateUser(email, password);
        if (authenticated) {
            return "Login successful!";
        } else {
            return "Login failed! Invalid username or password.";
        }
    }

}
