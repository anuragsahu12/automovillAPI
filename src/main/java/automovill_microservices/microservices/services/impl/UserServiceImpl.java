package automovill_microservices.microservices.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.Users;
import automovill_microservices.microservices.repository.UserRepository;
import automovill_microservices.microservices.services.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<Users> getUserDetails() {
        return userRepository.findAll();
    }

    
}
