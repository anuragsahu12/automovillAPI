package automovill_microservices.microservices.entities;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(unique = true)
    private String username;
    private String password;
    private boolean is_admin;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    // public String getUsername() {
    //     return username;
    // }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isIs_admin() {
        return is_admin;
    }
    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }

    public Users(){
        super();
    }

    public Users(String id, String username, String password, boolean is_admin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.is_admin = is_admin;
    }
    
    @Override
    public String toString() {
        return "Users [id=" + id + ", user_name=" + username + ", password=" + password + ", is_admin=" + is_admin
                + "]";
    }


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
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
       return true;
    }

   
    
}
