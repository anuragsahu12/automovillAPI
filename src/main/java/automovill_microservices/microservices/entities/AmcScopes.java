package automovill_microservices.microservices.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "amc_scopes")
public class AmcScopes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int amc_id;
    private String scope_of_work;
    private String details;
    private int frequency;
    private int TAT;
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAmc_id() {
        return amc_id;
    }
    public void setAmc_id(int amc_id) {
        this.amc_id = amc_id;
    }
    public String getScope_of_work() {
        return scope_of_work;
    }
    public void setScope_of_work(String scope_of_work) {
        this.scope_of_work = scope_of_work;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public int getFrequency() {
        return frequency;
    }
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    public int getTAT() {
        return TAT;
    }
    public void setTAT(int tAT) {
        TAT = tAT;
    }
    
    public AmcScopes(int id, int amc_id, String scope_of_work, String details, int frequency, int tAT) {
        this.id = id;
        this.amc_id = amc_id;
        this.scope_of_work = scope_of_work;
        this.details = details;
        this.frequency = frequency;
        TAT = tAT;
    }

    public AmcScopes(){
        super();
    }
    
    @Override
    public String toString() {
        return "AmcScopes [id=" + id + ", amc_id=" + amc_id + ", scope_of_work=" + scope_of_work + ", details="
                + details + ", frequency=" + frequency + ", TAT=" + TAT + "]";
    }

    

    
    

}
