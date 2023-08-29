package automovill_microservices.microservices.others;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceRequest {
    private String chassis_num;
    private String date_of_booking;
    private Object services;
    private float total_cost;
    private String workshop_id;
    private int last_service_km;
    private String last_service_date;
    private List<String> amc_items;
}
