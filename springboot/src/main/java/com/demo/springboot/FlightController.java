package com.demo.springboot;

import com.demo.springboot.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/flights/{name}")
    public String deleteFlight(@PathVariable String name){
        Flight flight=flights.stream().filter(f->f.getName().equals(name)).findAny().get();
        flights.remove(flight);
        return name+" deleted";
    }

    @PutMapping("/flights/{name}")
    public String putFlight(@PathVariable String name,@RequestBody Flight newFlight) {
        Flight flight = flights.stream().filter(f -> f.getName().equals(name)).findAny().get();
        flights.set(flights.indexOf(flight),newFlight);
        return name+" updated";
    }



}
