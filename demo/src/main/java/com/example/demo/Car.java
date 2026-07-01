package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.EnginePackage.Engine;

@Component
public class Car {

    private Engine engine;

    public Car(@Qualifier("petrolEngine")Engine engine){
        this.engine=engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is Moving");
    }
    
}
