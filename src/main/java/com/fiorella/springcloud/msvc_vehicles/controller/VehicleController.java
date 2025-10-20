package com.fiorella.springcloud.msvc_vehicles.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
/*
   @Value("${server.port}")
    private int port;

    @GetMapping
    public List<Vehicle> listVehicles() {
        List<Vehicle> vehicles = List.of(
                new Vehicle(1L, "ABC-123", "Toyota", "Corolla", "ENG-001", 5, 0),
                new Vehicle(2L, "XYZ-456", "Honda", "Civic", "ENG-002", 5, 0),
                new Vehicle(3L, "JKL-789", "Nissan", "Sentra", "ENG-003", 5, 0),
                new Vehicle(4L, "MNO-321", "Ford", "Ranger", "ENG-004", 2, 0)
        );

        // Asignar el puerto actual para distinguir instancias
        return vehicles.stream()
                .map(v -> {
                    v.setPort(port);
                    return v;
                })
                .collect(Collectors.toList());
    }*/

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public ResponseEntity<List<Vehicle>> list() {
        return ResponseEntity.ok(vehicleService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> detail(@PathVariable Long id) {
        Optional<Vehicle> optional = vehicleService.findById(id);
        if (optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    } 
}
