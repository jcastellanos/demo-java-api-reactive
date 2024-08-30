package com.jcastellanos.demo.service;

import com.jcastellanos.demo.model.City;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Arrays;

@Service
public class CityService {

    public Flux<City> getCities() {
        return Flux.fromIterable(Arrays.asList(new City[]{
                new City("Bogota", "Colombia"),
                new City("Cali", "Colombia"),
                new City("Medellin", "Colombia"),
                new City("Cartagena", "Colombia"),
                new City("Barranquilla", "Colombia"),
                new City("Cucuta", "Colombia"),
                new City("Bucaramanga", "Colombia"),
                new City("Valledupar", "Colombia"),
                new City("Villavicencio", "Colombia"),
                new City("Pereira", "Colombia"),
                new City("Manizales", "Colombia"),
                new City("Pasto", "Colombia"),
                new City("Neiva", "Colombia"),
                new City("Nueva York", "Estados Unidos"),
                new City("Baltimore", "Estados Unidos"),
                new City("Detroit", "Estados Unidos"),
                new City("Austin", "Estados Unidos"),
                new City("Oklahoma", "Estados Unidos"),
                new City("Reno", "Estados Unidos"),
                new City("Louisville", "Estados Unidos"),
                new City("Kansas", "Estados Unidos"),
        }));
    }
}
