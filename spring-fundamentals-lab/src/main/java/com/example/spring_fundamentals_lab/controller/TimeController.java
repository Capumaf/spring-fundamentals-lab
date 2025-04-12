package com.example.spring_fundamentals_lab.controller;

import com.example.spring_fundamentals_lab.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time")
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("")
    public String getTime() {
        return "Current Time: " + timeService.getCurrentTime().toString();
    }

    @GetMapping("/date")
    public String getDate() {
        return "Current Date: " + timeService.getCurrentDate().toString();
    }

    @GetMapping("/day")
    public String getDayOfWeek() {
        return "Current Day: " + timeService.getDayOfWeek().toString();
    }

    @GetMapping("/all")
    public String getAll() {
        return "Time: " + timeService.getCurrentTime() +
                ", Date: " + timeService.getCurrentDate() +
                ", Day: " + timeService.getDayOfWeek();
    }
}
