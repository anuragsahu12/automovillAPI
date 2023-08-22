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
    private boolean admin;

    
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
    public boolean getAdmin() {
        return admin;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    @Override
    public String toString() {
        return "RegisterRequest [username=" + username + ", password=" + password + ", is_admin=" + admin + "]";
    }

}
