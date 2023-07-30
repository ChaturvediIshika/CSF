package com.demo.springboot;

import com.demo.springboot.model.Flight;
import org.springframework.context.annotation.Bean;
import java.util.ArrayList;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public ArrayList<Flight> getFlights(){
        System.out.println("Inside Bean function");
        ArrayList<Flight> flights =new ArrayList<>();
        flights.add(Flight.builder()
                .departure("12:00 pm")
                .arrival("6:00 pm")
                .src("Delhi Airport")
                .des("Bangalore Airport")
                .name("Indigo")
                .build());
        flights.add(new Flight());
        flights.add(new Flight());
        return flights;
    }

}



