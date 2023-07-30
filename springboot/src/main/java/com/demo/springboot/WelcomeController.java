package com.demo.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class WelcomeController {

    ArrayList<Integer> numbers;

    @Autowired
    public WelcomeController(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    @Value("${name}")
    String name;

    @GetMapping
    public String home(){
        return numbers.toString();
    }
    @GetMapping("/name")
    public  String getWelcomeMessage(){
        return name+" "+numbers.toString();
    }

    @PostMapping
    public String postMapping(){
        return "this is post mapping";
    }

    @PutMapping
    public String putMapping(){
        return "this is put mapping api";
    }

    @PatchMapping
    public String patchApi(){
        return "This is patch Api";
    }

    @DeleteMapping
    public String deleteApi(){
        return "This is delete api";
    }
}
