package com.example.demo.SingletonAndPrototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class CalculatorSingleton {

    public int add(int a, int b) {
        return a + b;
    }
}
