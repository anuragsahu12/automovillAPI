package automovill_microservices.microservices.others;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddNewVehicleRequest {
    private int warranty_id;
    private int amc_id;
    private String chassis_num;
}
