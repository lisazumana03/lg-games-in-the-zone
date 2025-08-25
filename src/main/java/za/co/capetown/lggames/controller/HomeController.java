package za.co.capetown.lggames.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {
    @RequestMapping("/main")
    public String home() {
        return "Welcome to the Gaming System";
    }
}
