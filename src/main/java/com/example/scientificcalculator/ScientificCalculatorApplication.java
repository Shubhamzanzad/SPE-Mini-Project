package com.example.scientificcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.scientificcalculator.scientificCalculator;
@SpringBootApplication
public class ScientificCalculatorApplication {

    public static void main(String[] args) {
        scientificCalculator obj = new scientificCalculator();
        obj.run();
    }

}
