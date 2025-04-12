package com.example.spring_fundamentals_lab.controller;

import com.example.spring_fundamentals_lab.service.TimeService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/time")
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping
    public String getTime() {
        return "Current Time: " + timeService.getCurrentTime();
    }

    @GetMapping("/date")
    public String getDate() {
        return "Current Date: " + timeService.getCurrentDate();
    }

    @GetMapping("/day")
    public String getDay() {
        return "Day of Week: " + timeService.getDayOfWeek();
    }

    @GetMapping("/all")
    public Map<String, Object> getAll() {
        Map<String, Object> data = new HashMap<>();
        data.put("time", timeService.getCurrentTime());
        data.put("date", timeService.getCurrentDate());
        data.put("day", timeService.getDayOfWeek());
        return data;
    }
}

