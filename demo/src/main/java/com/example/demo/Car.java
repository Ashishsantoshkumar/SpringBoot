package com.example.demo;

import com.example.demo.EnginePackage.Engine;

// @Component
public class Car {

    private final Engine engine;

    public Car(Engine engine){
        this.engine=engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is Moving");
    }
    
}
