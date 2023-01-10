package com.weather.service;

import org.springframework.stereotype.Service;

@Service
public class RainingDayService implements WeatherService {

    @Override
    public String forecast() {
        System.out.println("RainingDay Feature added by Pandurang");
        return "Today is raining day!";
    }

}
