package automovill_microservices.microservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.Users;

@Service
public interface UserService {
    public List<Users> getUserDetails();
    public Users addUser(Users user);
}
