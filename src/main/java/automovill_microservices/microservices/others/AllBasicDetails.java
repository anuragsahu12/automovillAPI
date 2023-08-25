package automovill_microservices.microservices.others;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AllBasicDetails {
    private String chassis_num;
    private String phone_num;
    private String owner;
    private String reg_date;
    private String warranty_start;
    private String warranty_end;
    private String amc_start_date;
    private String amc_end_date;
    private String last_service_date;
    private int last_service_km;
    private String make;
    private String model;
    private String fuel_type;
    private String amc_type;

}
