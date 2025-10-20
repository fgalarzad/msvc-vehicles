package com.fiorella.springcloud.msvc_vehicles.entity;

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
    
   
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String licensePlate;
    private String brand;
    private String model;
    private String engineSeries;
    private int numberOfSeats;

    @Transient
    private int port;


}
