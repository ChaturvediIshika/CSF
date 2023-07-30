package com.demo.springboot;

import com.demo.springboot.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class FlightController {


    @Autowired
    ArrayList<Flight> flights;

    @GetMapping("/flights")
    public ArrayList<Flight> getFlights(){
        return flights;
    }

    @PostMapping("/flights")
    public Flight addFlight(@RequestBody Flight newFlight){
        flights.add(newFlight);
        return newFlight;
    }
}
