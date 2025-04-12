package com.example.spring_fundamentals_lab.controller;

import com.example.spring_fundamentals_lab.service.WeatherService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/temperature")
    public String getTemperature() {
        return "Temperature: " + weatherService.getCurrentTemperature() + "°C";
    }

    @GetMapping("/condition")
    public String getCondition() {
        return "Condition: " + weatherService.getWeatherCondition();
    }

    @GetMapping("/wind")
    public String getWind() {
        return "Wind Speed: " + weatherService.getWindSpeed() + " km/h";
    }

    @GetMapping("/all")
    public Map<String, Object> getAllWeather() {
        Map<String, Object> weather = new HashMap<>();
        weather.put("temperature", weatherService.getCurrentTemperature());
        weather.put("condition", weatherService.getWeatherCondition());
        weather.put("windSpeed", weatherService.getWindSpeed());
        return weather;
    }
}

