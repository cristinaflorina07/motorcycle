package com.motorcycle.controller;

import com.motorcycle.entity.Motorcycle;
import com.motorcycle.service.MotorcycleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/motorcycle")
public class MotorcycleController {
    private final MotorcycleService motorcycleService;

    public MotorcycleController(MotorcycleService motorcycleService) {
        this.motorcycleService = motorcycleService;
    }

    @GetMapping("/all")
    public List<Motorcycle> getAllMotorcycles() {
        return motorcycleService.getAllMotorcycle();
    }

    @GetMapping("/find/{id}")
    public Optional<Motorcycle> findMotorcycleById(@PathVariable Long id) {
        return motorcycleService.findMotorcycleById(id);
    }

    @PostMapping("/addmotorcycle")
    public ResponseEntity<Motorcycle> addMotorcycle(@RequestBody Motorcycle motorcycle) {
        return motorcycleService.addMotorcycle(motorcycle);
    }

}
