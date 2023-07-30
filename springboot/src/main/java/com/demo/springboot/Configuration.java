package com.demo.springboot;

import org.springframework.context.annotation.Bean;
import java.util.ArrayList;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public ArrayList<Integer> getNumbers(){
        System.out.println("Inside Bean function");
        ArrayList<Integer> numbers =new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        return numbers;
    }

}



