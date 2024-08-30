package com.jcastellanos.demo.controller;

import com.jcastellanos.demo.model.City;
import com.jcastellanos.demo.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class MainController {

    private static final Logger log = LoggerFactory.getLogger(MainController.class);
    @Autowired
    private CityService cityService;
    @Value("${city.limit}")
    private String cityLimit;

    @GetMapping("/cities")
    public Flux<City> home() {
        var limit = 21;
        try {
            limit = Integer.parseInt(cityLimit);
        } catch (NumberFormatException ex) {
            // No es necesario relizar nada
            log.warn("Asignando valor por defecto a city.limit");
        }
        return cityService.getCities().take(limit);
    }
}
