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
@Table(name = "vehicle_details")
public class VehicleDetails {
    @Id
    @Column(name = "chassis_num")
    private String chassis_num;
    private String phone_num;
    private String owner;
    private String reg_date;
    private String warranty_start;
    private String warranty_end;
    private int amc_id;
    private String amc_start_date;
    private String amc_end_date;
    private String basic_details_id;
    private String last_service_date;
    private int last_service_km;
     
}
