package com.example.demo.SingletonAndPrototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CalculatorPrototype {
     private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
