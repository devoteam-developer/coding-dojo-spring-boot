package com.assignment.spring.service;

import com.assignment.spring.entity.WeatherEntity;


public interface WeatherService {

    WeatherEntity findByCity(String city);

}
