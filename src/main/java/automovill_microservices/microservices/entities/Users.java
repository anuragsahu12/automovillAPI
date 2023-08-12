package automovill_microservices.microservices.entities;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class Users implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String username;
    private String password;
    private boolean is_admin;
   


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        
        return null;
    }
    @Override
    public String getUsername() {
        return this.username;
    }
    @Override
    public boolean isAccountNonExpired() {
        
        return false;
    }
    @Override
    public boolean isAccountNonLocked() {
        
        return false;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        
        return false;
    }
    @Override
    public boolean isEnabled() {
        
        return false;
    }
}

    
    