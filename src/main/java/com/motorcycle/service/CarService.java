package com.motorcycle.service;

import com.motorcycle.entity.Car;
import com.motorcycle.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCar() {
        return carRepository.findAll();
    }

    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    public Optional<Car> findCarbyId(Long id) {
        return carRepository.findById(id);
    }

    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }
}