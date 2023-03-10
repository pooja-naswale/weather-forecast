package com.weather.controller;

import com.weather.service.RainingDayService;
import com.weather.service.SunnyDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

	@Autowired
	private RainingDayService rainingDayService;

	@Autowired
	private CloudyDayService cloudyDayService;

	@Autowired
	private SunnyDayService sunnyDayService;

	@GetMapping("/checkWeather")
	public String getStudentDetails() {
		return cloudyDayService.forecast();
	}
}
