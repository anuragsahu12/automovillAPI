package automovill_microservices.microservices.others;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceDetailsChassis implements Comparable<InvoiceDetailsChassis>{
    private String bill_number;
    private String date_of_booking;
    private Object services;
    private float total_cost;
    private String workshop_id;
    private int distance_travelled;

    @Override
    public int compareTo(InvoiceDetailsChassis other) {
        return this.date_of_booking.compareTo(other.date_of_booking);
    }

}

