package com.weather.service;

import org.springframework.stereotype.Service;

@Service
public class SunnyDayService implements WeatherService {
    @Override
    public String forecast() {
        return "Today is sunny day!";
    }
}