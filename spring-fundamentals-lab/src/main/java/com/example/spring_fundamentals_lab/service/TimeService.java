package com.example.spring_fundamentals_lab.service;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.DayOfWeek;

@Service
public class TimeService {

    public LocalTime getCurrentTime() {
        return LocalTime.now();
    }

    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    public DayOfWeek getDayOfWeek() {
        return LocalDate.now().getDayOfWeek();
    }
}
