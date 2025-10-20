package com.fiorella.springcloud.msvc_vehicles.repository;

import org.springframework.data.repository.CrudRepository;

import com.fiorella.springcloud.msvc_vehicles.entity.Vehicle;

public interface VehicleRepository extends CrudRepository <Vehicle,Long> {

}
