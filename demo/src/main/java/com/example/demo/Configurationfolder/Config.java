package com.example.demo.Configurationfolder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.demo.Car;
import com.example.demo.EnginePackage.DiselEngine;
import com.example.demo.EnginePackage.Engine;
import com.example.demo.EnginePackage.PetrolEngine;

@Configuration
public class Config {
    

    @Bean
    public Engine createPetrol(){
        return new PetrolEngine();
    }
    @Bean
    @Primary
    public Engine createDiesel(){
        return new DiselEngine();
    }

    @Bean
    public Car createCar(Engine engine){
        return new Car(engine);
    }
    
}
