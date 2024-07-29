package com.motorcycle.controller;

import com.motorcycle.entity.Motorcycle;
import com.motorcycle.service.MotorcycleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/caracteristiciMotorcycle")
public class MotorcycleController {
    private final MotorcycleService caracteristiciMotorcycleService;

    public MotorcycleController(MotorcycleService caracteristiciMotorcycleService) {
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
