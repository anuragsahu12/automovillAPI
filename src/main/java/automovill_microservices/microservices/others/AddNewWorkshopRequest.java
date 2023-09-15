package automovill_microservices.microservices.others;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddNewWorkshopRequest {
    private String state;
    private String name;
    private String address;
    private String pin;
    private String contact;
}
