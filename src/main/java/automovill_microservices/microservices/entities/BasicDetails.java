package automovill_microservices.microservices.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
    
}
