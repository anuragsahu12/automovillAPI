package automovill_microservices.microservices.others;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AmcAvailabilityDetails {
    private String scopeOfWork;
    private String details;
    private int frequency;
}
