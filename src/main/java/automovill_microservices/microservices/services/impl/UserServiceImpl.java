package automovill_microservices.microservices.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.Users;
import automovill_microservices.microservices.repository.UserRepository;
import automovill_microservices.microservices.services.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public List<Users> getUserDetails() {
        return userRepository.findAll();
    }

    @Override
    public Users createUser(Users user) {
       
        user.setId(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    
}
