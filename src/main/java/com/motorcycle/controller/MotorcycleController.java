package com.motorcycle.controller;

import com.motorcycle.entity.Motorcycle;
import com.motorcycle.service.MotorcycleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moto")
public class MotorcycleController {
    private final MotorcycleService motorcycleService;

    public MotorcycleController(MotorcycleService motorcycleService) {
        this.motorcycleService = motorcycleService;
    }

    @PostMapping("/addmoto")
    public ResponseEntity<Motorcycle> addMotorcycle(@RequestBody Motorcycle motorcycle) {
        return motorcycleService.addCaracteristiciMotorcycle(motorcycle);
    }

    @GetMapping("/all")
    public List<Motorcycle> getCaracteristiciMotorcycle() {
        return motorcycleService.getAllMotorcycle();
    }

//    @GetMapping
//    public

}
