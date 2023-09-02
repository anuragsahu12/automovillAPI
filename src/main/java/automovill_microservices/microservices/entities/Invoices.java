package automovill_microservices.microservices.entities;

import automovill_microservices.microservices.others.JsonConverter;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
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
@Table(name = "invoices")
public class Invoices {
    
    @Id
    private String bill_number;

    @Column(name = "chassis_num")
    private String chassisNum;
    private String workshop_id;
    private String date_of_booking;

    @Convert(converter = JsonConverter.class)
    private Object services;

    private float total_cost;

    
}
