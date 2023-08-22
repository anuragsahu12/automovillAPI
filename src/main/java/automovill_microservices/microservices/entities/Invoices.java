package automovill_microservices.microservices.entities;

import automovill_microservices.microservices.others.JsonConverter;
import jakarta.persistence.Convert;
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
@Table(name = "invoices")
public class Invoices {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String bill_number;
    private String chassis_num;
    private String workshop_id;
    private String date_of_booking;

    @Convert(converter = JsonConverter.class)
    private Object services;

    private float total_cost;

    
}
