package com.demo.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Sample {

    ArrayList<Integer> numbers;
    HelloRestApi helloRestApi;
    @Autowired
    public Sample(HelloRestApi helloRestApi,ArrayList<Integer> numbers) {
        System.out.println(helloRestApi.getHello());
        System.out.println(numbers);
        this.helloRestApi=helloRestApi;
        this.numbers=numbers;
        System.out.println("Sample class");
    }
}
