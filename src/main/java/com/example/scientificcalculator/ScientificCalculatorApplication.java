package com.example.scientificcalculator;

import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class ScientificCalculatorApplication {

    public static void main(String[] args) {
        scientificCalculator obj = new scientificCalculator();
        obj.run();
    }

}
