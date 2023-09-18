package automovill_microservices.microservices.entities;

import java.util.List;

import automovill_microservices.microservices.others.JsonArrayConverter;
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

    @Convert(converter = JsonArrayConverter.class)
    @Column(length = 1500)
    private List<Object> services;

    private float total_cost;

    
}
