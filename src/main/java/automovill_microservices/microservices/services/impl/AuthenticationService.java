package automovill_microservices.microservices.services.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import automovill_microservices.microservices.entities.Users;
import automovill_microservices.microservices.repository.UserRepository;



@Service
@Transactional
public class AuthenticationService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public Users registerUser(String username,String password, boolean is_admin ){
        
        String encodedPassword = passwordEncoder.encode(password);
        
        return userRepository.save(new Users(UUID.randomUUID().toString(),username ,passwordEncoder.encode(encodedPassword),is_admin));
    }

}
