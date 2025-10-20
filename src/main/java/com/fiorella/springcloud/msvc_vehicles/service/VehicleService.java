package com.fiorella.springcloud.msvc_vehicles.service;

import java.util.List;
import java.util.Optional;

import com.fiorella.springcloud.msvc_vehicles.entity.Vehicle;

public interface VehicleService {

    
    List<Vehicle> findAll();

    Optional<Vehicle> findById(Long id);

}
