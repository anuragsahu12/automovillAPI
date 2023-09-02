package automovill_microservices.microservices.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "parts")
public class Parts {
    
    @Id
    private int id;

    @Column(name = "part_code")
    private String partCode;

    @Column(name = "item_name")
    private String itemName;
    private float price;
    private String hsn;
    private String tax;
    
}

