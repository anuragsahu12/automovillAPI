package automovill_microservices.microservices.others;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddNewVehicleRequest {
    private String chassis_num;
    private String make;
    private String model;
    private String fuel_type;
    private String phone_number;
    private String owner;
    private String reg_date;
    private String warranty_start;
    private String warranty_end;
    private String amc_start_date;
    private String amc_end_date;
    private int warranty_id;
    private int amc_id;
}
