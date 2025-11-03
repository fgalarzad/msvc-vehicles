package com.fiorella.springcloud.msvc_vehicles.controller;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiorella.springcloud.msvc_vehicles.entity.Vehicle;
import com.fiorella.springcloud.msvc_vehicles.service.VehicleService;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {


    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public ResponseEntity<List<Vehicle>> list() {
        return ResponseEntity.ok(vehicleService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> detail(@PathVariable Long id) throws InterruptedException{
        
        if (id.equals(5L)){
            throw new IllegalStateException("Vehiculo no encontrados");

        }
        if (id.equals(2L)) {
            TimeUnit.SECONDS.sleep(1L);
        }
        
        Optional<Vehicle> optional = vehicleService.findById(id);
        if (optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    } 
}
