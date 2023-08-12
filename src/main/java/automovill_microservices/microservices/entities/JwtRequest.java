package automovill_microservices.microservices.entities;

public class JwtRequest {
    private String username;
    private String password;
    
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public JwtRequest(){
        super();
    }

    public JwtRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
   
    @Override
    public String toString() {
        return "JwtRequest [username=" + username + ", password=" + password + "]";
    }

    
}
