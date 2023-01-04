package com.weather.service;

import org.springframework.stereotype.Service;

@Service
public class RainingDayService implements WeatherService {

    @Override
    public String forecast() {
        return "Today is raining day!";
    }

}
