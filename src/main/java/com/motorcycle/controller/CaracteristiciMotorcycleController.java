package com.motorcycle.controller;

import com.motorcycle.entity.Motorcycle;
import com.motorcycle.repository.CaracteristiciMotocycleRepository;
import com.motorcycle.service.CaracteristiciMotorcycleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/caracteristiciMotorcycle")
public class CaracteristiciMotorcycleController {
    private final CaracteristiciMotorcycleService caracteristiciMotorcycleService;

    public CaracteristiciMotorcycleController(CaracteristiciMotorcycleService caracteristiciMotorcycleService) {
        this.caracteristiciMotorcycleService = caracteristiciMotorcycleService;
    }

    @PostMapping("/introducere")
    public ResponseEntity<Motorcycle> addCaracteristiciMotorcycle(@RequestBody Motorcycle caracteristiciMotorcycle) {
        return caracteristiciMotorcycleService.addCaracteristiciMotorcycle(caracteristiciMotorcycle);
    }

//    @GetMapping("/get")
//    public List<Motorcycle> getCaracteristiciMotorcycle() {
//        return caracteristiciMotocycleRepository.findAll();

    }
//}
