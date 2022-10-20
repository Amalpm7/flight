package com.example.flightbackend.Controller;

import com.example.flightbackend.Dao.FlightDao;
import com.example.flightbackend.Model.FlightModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private FlightDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addFlight",consumes = "application/json", produces = "application/json")
    public String viewFlight(@RequestBody FlightModel flight){
        dao.save(flight);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewFlight")
    public List<FlightModel> allflight(){
        return (List<FlightModel>) dao.findAll();
    }


    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/deleteflight" ,consumes = "application/json", produces = "application/json")
    public String deleteflight(@RequestBody FlightModel flight){
        dao.deleteflightbyid(flight.getId());
        return "{status:'success'}";
    }
}
