package com.example.flightbackend.Dao;

import com.example.flightbackend.Model.FlightModel;
import org.springframework.data.repository.CrudRepository;

public interface FlightDao extends CrudRepository<FlightModel,Integer> {
}
