package com.motorcycle.controller;

import com.motorcycle.entity.Car;
import com.motorcycle.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carController")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/getCar")
    public List<Car> getCar() {
        return carService.getCar();
    }

    @PostMapping
    public Car addCar(@RequestBody Car car) {
        return carService.addCar(car);
    }

    @GetMapping("/get/{id}")
    public Optional<Car> findCarById(@PathVariable Long id) {
        return carService.findCarbyId(id);

    }
}

