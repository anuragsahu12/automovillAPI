package automovill_microservices.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.web.exchanges.HttpExchange.Principal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import automovill_microservices.microservices.entities.Users;
import automovill_microservices.microservices.services.UserService;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getUsers")
    public List<Users> getUserDetails() {
        return userService.getUserDetails();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
