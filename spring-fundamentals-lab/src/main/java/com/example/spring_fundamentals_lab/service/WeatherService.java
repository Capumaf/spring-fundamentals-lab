package com.example.spring_fundamentals_lab.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class WeatherService {

    private final Random random = new Random();

    public int getTemperature() {
        return random.nextInt(51) - 10; // Rango: -10 a 40
    }

    public String getCondition() {
        String[] conditions = {"Sunny", "Rainy", "Cloudy", "Windy"};
        return conditions[random.nextInt(conditions.length)];
    }

    public int getWindSpeed() {
        return random.nextInt(101); // 0 a 100
    }
}
