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
@Table(name = "warranty_scopes")
public class WarrantyScopes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int warranty_id;
    private String scope_of_work;
    private String details;

    private int frequency;
}
