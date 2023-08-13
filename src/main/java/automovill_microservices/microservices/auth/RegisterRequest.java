package automovill_microservices.microservices.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String username;
    private String password;
    private boolean is_admin;

    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isAdmin() {
        return is_admin;
    }
    public void setAdmin(boolean is_admin) {
        this.is_admin = is_admin;
    }
    @Override
    public String toString() {
        return "RegisterRequest [username=" + username + ", password=" + password + ", is_admin=" + is_admin + "]";
    }

}
