package com.jcastellanos.demo.controller;

import com.jcastellanos.demo.model.City;
import com.jcastellanos.demo.service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class MainController {
    private CityService cityService;

    public MainController(CityService cityService) {
        this.cityService = cityService;
    }
    @GetMapping("/cities")
    public Flux<City> home() {
        return cityService.getCities();
    }
}
