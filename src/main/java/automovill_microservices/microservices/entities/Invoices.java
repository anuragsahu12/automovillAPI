package automovill_microservices.microservices.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "invoices")
public class Invoices {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String bill_number;
    private String chassis_num;
    private String workshop_id;
    private String date_of_booking;
    private String services;  // TODO: Should it be JSON? if so how??
    private float total_cost;

    
    
    public String getBill_number() {
        return bill_number;
    }
    public void setBill_number(String bill_number) {
        this.bill_number = bill_number;
    }
    public String getChassis_num() {
        return chassis_num;
    }
    public void setChassis_num(String chassiss_num) {
        this.chassis_num = chassiss_num;
    }
    public String getWorkshop_id() {
        return workshop_id;
    }
    public void setWorkshop_id(String workshop_id) {
        this.workshop_id = workshop_id;
    }
    public String getDate_of_booking() {
        return date_of_booking;
    }
    public void setDate_of_booking(String date_of_booking) {
        this.date_of_booking = date_of_booking;
    }
    public String getServices() {
        return services;
    }
    public void setServices(String services) {
        this.services = services;
    }
    public float getTotal_cost() {
        return total_cost;
    }
    public void setTotal_cost(float total_cost) {
        this.total_cost = total_cost;
    }

    public Invoices(String bill_number, String chassiss_num, String workshop_id, String date_of_booking, String services, float total_cost) {
        this.bill_number = bill_number;
        this.chassis_num = chassiss_num;
        this.workshop_id = workshop_id;
        this.date_of_booking = date_of_booking;
        this.services = services;
        this.total_cost = total_cost;
    }

    public Invoices() {
        super();
    }
    @Override
    public String toString() {
        return "Invoices [bill_number=" + bill_number + ", chassiss_num=" + chassis_num + ", workshop_id="
                + workshop_id + ", date_of_booking=" + date_of_booking + ", services=" + services + ", total_cost="
                + total_cost + "]";
    }

    
}
