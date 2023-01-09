package com.weather.service;

import org.springframework.stereotype.Service;

@Service
public class CloudyDayService implements WeatherService {

    @Override
    public String forecast() {
        return "Today is cloudy day!";
    }

}
