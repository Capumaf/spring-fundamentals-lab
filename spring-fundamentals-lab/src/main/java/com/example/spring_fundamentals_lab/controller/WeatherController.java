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
        return "Temperature: " + weatherService.getTemperature() + "°C";
    }

    @GetMapping("/condition")
    public String getCondition() {
        return "Condition: " + weatherService.getCondition();
    }

    @GetMapping("/wind")
    public String getWindSpeed() {
        return "Wind Speed: " + weatherService.getWindSpeed() + " km/h";
    }

    @GetMapping("/all")
    public Map<String, Object> getAllWeather() {
        Map<String, Object> data = new HashMap<>();
        data.put("temperature", weatherService.getTemperature());
        data.put("condition", weatherService.getCondition());
        data.put("windSpeed", weatherService.getWindSpeed());
        return data;
    }
}
