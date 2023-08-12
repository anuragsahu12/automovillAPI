package automovill_microservices.microservices.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String user_name;
    private String password;
    private boolean is_admin;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
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

    public Users(String id, String user_name, String password, boolean is_admin) {
        this.id = id;
        this.user_name = user_name;
        this.password = password;
        this.is_admin = is_admin;
    }
    
    @Override
    public String toString() {
        return "Users [id=" + id + ", user_name=" + user_name + ", password=" + password + ", is_admin=" + is_admin
                + "]";
    }

    

    
   
   
   
   
    
}
