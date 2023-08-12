package automovill_microservices.microservices.services.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import automovill_microservices.microservices.entities.Users;
import automovill_microservices.microservices.repository.UserRepository;

@Service
public class CustomUserServiceDetails implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("In user details service");

        // if(!username.equals("Anurag")) throw new UsernameNotFoundException("Not Anurag");
        
        // return new Users(UUID.randomUUID().toString(),"Anurag" ,passwordEncoder.encode("password"),false);

        return userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

    
}
