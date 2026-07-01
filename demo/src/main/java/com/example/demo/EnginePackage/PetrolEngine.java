package com.example.demo.EnginePackage;

import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class PetrolEngine implements Engine{
    
    @Override
    public void start(){
        System.out.println("heloo this is the petrol engineeeee");
    }

}
