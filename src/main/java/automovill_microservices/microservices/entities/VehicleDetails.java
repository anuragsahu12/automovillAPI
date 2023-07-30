package automovill_microservices.microservices.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle_details")
public class VehicleDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
   
   
    public String getChassis_num() {
        return chassis_num;
    }
    public void setChassis_num(String chassis_num) {
        this.chassis_num = chassis_num;
    }
    public String getPhone_num() {
        return phone_num;
    }
    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getReg_date() {
        return reg_date;
    }
    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }
    public String getWarranty_start() {
        return warranty_start;
    }
    public void setWarranty_start(String warranty_start) {
        this.warranty_start = warranty_start;
    }
    public String getWarranty_end() {
        return warranty_end;
    }
    public void setWarranty_end(String warranty_end) {
        this.warranty_end = warranty_end;
    }
    public int getAmc_id() {
        return amc_id;
    }
    public void setAmc_id(int amc_id) {
        this.amc_id = amc_id;
    }
    public String getAmc_start_date() {
        return amc_start_date;
    }
    public void setAmc_start_date(String amc_start_date) {
        this.amc_start_date = amc_start_date;
    }
    public String getAmc_end_date() {
        return amc_end_date;
    }
    public void setAmc_end_date(String amc_end_date) {
        this.amc_end_date = amc_end_date;
    }
    public String getBasic_details_id() {
        return basic_details_id;
    }
    public void setBasic_details_id(String basic_details_id) {
        this.basic_details_id = basic_details_id;
    }
    public String getLast_service_date() {
        return last_service_date;
    }
    public void setLast_service_date(String last_service_date) {
        this.last_service_date = last_service_date;
    }
    public int getLast_service_km() {
        return last_service_km;
    }
    public void setLast_service_km(int last_service_km) {
        this.last_service_km = last_service_km;
    }
    
    public VehicleDetails(String chassis_num, String phone_num, String owner, String reg_date, String warranty_start,
            String warranty_end, int amc_id, String amc_start_date, String amc_end_date, String basic_details_id,
            String last_service_date, int last_service_km) {
        this.chassis_num = chassis_num;
        this.phone_num = phone_num;
        this.owner = owner;
        this.reg_date = reg_date;
        this.warranty_start = warranty_start;
        this.warranty_end = warranty_end;
        this.amc_id = amc_id;
        this.amc_start_date = amc_start_date;
        this.amc_end_date = amc_end_date;
        this.basic_details_id = basic_details_id;
        this.last_service_date = last_service_date;
        this.last_service_km = last_service_km;
    }
    public VehicleDetails() {
        super();
    }
    
    @Override
    public String toString() {
        return "VehicleDetails [chassis_num=" + chassis_num + ", phone_num=" + phone_num + ", owner=" + owner
                + ", reg_date=" + reg_date + ", warranty_start=" + warranty_start + ", warranty_end=" + warranty_end
                + ", amc_id=" + amc_id + ", amc_start_date=" + amc_start_date + ", amc_end_date=" + amc_end_date
                + ", basic_details_id=" + basic_details_id + ", last_service_date=" + last_service_date
                + ", last_service_km=" + last_service_km + "]";
    }

    
    
    
    
}
