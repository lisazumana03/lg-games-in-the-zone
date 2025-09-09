package za.co.capetown.lggames.controller.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.capetown.lggames.service.authentication.IUserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private IUserService userService;

}
