package automovill_microservices.microservices.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "workshops")
public class Workshops {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String state;
    private String name;
    private String address;
    private String pin;
    private String contact;
    
}

