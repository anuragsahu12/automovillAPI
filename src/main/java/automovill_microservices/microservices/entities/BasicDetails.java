package automovill_microservices.microservices.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "basic_details")
public class BasicDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String make;
    private String model;
    private String fuel_type;
    private String rated_power;
    private String peak_power;
    private String seat_height;
    private String loading_capacity;
    private String speedometer;
    private String battery_type;
    private String controller;
    private String brake_system;
    private String dimensions;
    private String tyre;
    private String charging_time;
    private String charger_specs;
    private String voltage;
    private String suspension;
    private String mileage;
    private String ground_clearance;
    private String icat;
    private String floor_mat;
    private String top_speed;
    private String wheel;
    private String headlight;
    private String backlight;
    private String brake_lever;
    private String battery_warranty;
    
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getFuel_type() {
        return fuel_type;
    }
    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }
    public String getRated_power() {
        return rated_power;
    }
    public void setRated_power(String rated_power) {
        this.rated_power = rated_power;
    }
    public String getPeak_power() {
        return peak_power;
    }
    public void setPeak_power(String peak_power) {
        this.peak_power = peak_power;
    }
    public String getSeat_height() {
        return seat_height;
    }
    public void setSeat_height(String seat_height) {
        this.seat_height = seat_height;
    }
    public String getLoading_capacity() {
        return loading_capacity;
    }
    public void setLoading_capacity(String loading_capacity) {
        this.loading_capacity = loading_capacity;
    }
    public String getSpeedometer() {
        return speedometer;
    }
    public void setSpeedometer(String speedometer) {
        this.speedometer = speedometer;
    }
    public String getBattery_type() {
        return battery_type;
    }
    public void setBattery_type(String battery_type) {
        this.battery_type = battery_type;
    }
    public String getController() {
        return controller;
    }
    public void setController(String controller) {
        this.controller = controller;
    }
    public String getBrake_system() {
        return brake_system;
    }
    public void setBrake_system(String brake_system) {
        this.brake_system = brake_system;
    }
    public String getDimensions() {
        return dimensions;
    }
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
    public String getTyre() {
        return tyre;
    }
    public void setTyre(String tyre) {
        this.tyre = tyre;
    }
    public String getCharging_time() {
        return charging_time;
    }
    public void setCharging_time(String charging_time) {
        this.charging_time = charging_time;
    }
    public String getCharger_specs() {
        return charger_specs;
    }
    public void setCharger_specs(String charger_specs) {
        this.charger_specs = charger_specs;
    }
    public String getVoltage() {
        return voltage;
    }
    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }
    public String getSuspension() {
        return suspension;
    }
    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }
    public String getMileage() {
        return mileage;
    }
    public void setMileage(String mileage) {
        this.mileage = mileage;
    }
    public String getGround_clearance() {
        return ground_clearance;
    }
    public void setGround_clearance(String ground_clearance) {
        this.ground_clearance = ground_clearance;
    }
    public String getIcat() {
        return icat;
    }
    public void setIcat(String icat) {
        this.icat = icat;
    }
    public String getFloor_mat() {
        return floor_mat;
    }
    public void setFloor_mat(String floor_mat) {
        this.floor_mat = floor_mat;
    }
    public String getTop_speed() {
        return top_speed;
    }
    public void setTop_speed(String top_speed) {
        this.top_speed = top_speed;
    }
    public String getWheel() {
        return wheel;
    }
    public void setWheel(String wheel) {
        this.wheel = wheel;
    }
    public String getHeadlight() {
        return headlight;
    }
    public void setHeadlight(String headlight) {
        this.headlight = headlight;
    }
    public String getBacklight() {
        return backlight;
    }
    public void setBacklight(String backlight) {
        this.backlight = backlight;
    }
    public String getBrake_lever() {
        return brake_lever;
    }
    public void setBrake_lever(String brake_lever) {
        this.brake_lever = brake_lever;
    }
    public String getBattery_warranty() {
        return battery_warranty;
    }
    public void setBattery_warranty(String battery_warranty) {
        this.battery_warranty = battery_warranty;
    }
    
    
    public BasicDetails(String id, String make, String model, String fuel_type, String rated_power, String peak_power,
            String seat_height, String loading_capacity, String speedometer, String battery_type, String controller,
            String brake_system, String dimensions, String tyre, String charging_time, String charger_specs,
            String voltage, String suspension, String mileage, String ground_clearance, String icat, String floor_mat,
            String top_speed, String wheel, String headlight, String backlight, String brake_lever,
            String battery_warranty) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.fuel_type = fuel_type;
        this.rated_power = rated_power;
        this.peak_power = peak_power;
        this.seat_height = seat_height;
        this.loading_capacity = loading_capacity;
        this.speedometer = speedometer;
        this.battery_type = battery_type;
        this.controller = controller;
        this.brake_system = brake_system;
        this.dimensions = dimensions;
        this.tyre = tyre;
        this.charging_time = charging_time;
        this.charger_specs = charger_specs;
        this.voltage = voltage;
        this.suspension = suspension;
        this.mileage = mileage;
        this.ground_clearance = ground_clearance;
        this.icat = icat;
        this.floor_mat = floor_mat;
        this.top_speed = top_speed;
        this.wheel = wheel;
        this.headlight = headlight;
        this.backlight = backlight;
        this.brake_lever = brake_lever;
        this.battery_warranty = battery_warranty;
    }

    public BasicDetails(){
        super();
    }
    
    
    @Override
    public String toString() {
        return "BasicDetails [id=" + id + ", make=" + make + ", model=" + model + ", fuel_type=" + fuel_type
                + ", rated_power=" + rated_power + ", peak_power=" + peak_power + ", seat_height=" + seat_height
                + ", loading_capacity=" + loading_capacity + ", speedometer=" + speedometer + ", battery_type="
                + battery_type + ", controller=" + controller + ", brake_system=" + brake_system + ", dimensions="
                + dimensions + ", tyre=" + tyre + ", charging_time=" + charging_time + ", charger_specs="
                + charger_specs + ", voltage=" + voltage + ", suspension=" + suspension + ", mileage=" + mileage
                + ", ground_clearance=" + ground_clearance + ", icat=" + icat + ", floor_mat=" + floor_mat
                + ", top_speed=" + top_speed + ", wheel=" + wheel + ", headlight=" + headlight + ", backlight="
                + backlight + ", brake_lever=" + brake_lever + ", battery_warranty=" + battery_warranty + "]";
    }

    
    

    
}
