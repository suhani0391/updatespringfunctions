package com.example1.updatespringfunction;

import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component
public class Greetingfunction implements Function<String , String> {
    
    @Override
    public String apply(String name) {
        return "Hello, " + name + "!";
    }
}
