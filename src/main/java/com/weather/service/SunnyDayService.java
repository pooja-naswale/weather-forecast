package com.weather.service;

import org.springframework.stereotype.Service;

@Service
public class SunnyDayService implements WeatherService {
    @Override
    public String forecast() {
    	System.out.println("inside sunny day service");
        return "Today is sunny day!";
    }
}