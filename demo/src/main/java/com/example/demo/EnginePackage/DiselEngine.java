package com.example.demo.EnginePackage;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class DiselEngine implements Engine {
    
    @Override
    public void start(){
        System.out.println("this is the disel enginennnnnnnn");
    }
}
