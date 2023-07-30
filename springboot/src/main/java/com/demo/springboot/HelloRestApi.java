package com.demo.springboot;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
public class HelloRestApi {
    public HelloRestApi() {
        System.out.println("I am inside hello rest api class");
    }
    public String getHello(){
        return "Hello World";
    }
}
