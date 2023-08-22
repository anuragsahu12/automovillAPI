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
@Table(name = "amc_availability")
public class AmcAvailability {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    
    private String chassis_num;

    private int amc_id;
    private String scope_of_work;
    private String details;
    private int frequency;
    private int consumed;

}
