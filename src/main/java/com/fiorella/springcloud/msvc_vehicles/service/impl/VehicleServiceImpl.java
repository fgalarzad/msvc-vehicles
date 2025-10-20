package com.fiorella.springcloud.msvc_vehicles.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiorella.springcloud.msvc_vehicles.entity.Vehicle;
import com.fiorella.springcloud.msvc_vehicles.repository.VehicleRepository;
import com.fiorella.springcloud.msvc_vehicles.service.VehicleService;
/*
@Service
public class VehicleServiceImpl implements VehicleService{
    


    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private Environment environment;

    @Override
    public List<Vehicle> findAll() {
        return ((List<Vehicle>) vehicleRepository.findAll()).stream().map(vehicle -> {
            vehicle.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
            return vehicle;
        }).collect(Collectors.toList());
    }

    @Override
    public Optional<Vehicle> findById(Long id) {
        return vehicleRepository.findById(id).map(vehicle -> {
            vehicle.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
            return vehicle;
        });
    }

} */


