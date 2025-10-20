package com.fiorella.springcloud.msvc_vehicles.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vehicles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "license_Plate")
    private String licensePlate;

    private String brand;
    private String model;
    
    @Column(name = "engine_Series")
    private String engineSeries;
    @Column(name = "number_Of_Seats")
    private Integer numberOfSeats;

    @Transient
    private int port;


}
