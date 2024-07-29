package com.motorcycle.service;

import com.motorcycle.entity.Motorcycle;
import com.motorcycle.repository.CaracteristiciMotocycleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MotorcycleService {

    private CaracteristiciMotocycleRepository caracteristiciMotocycleRepository;

    public MotorcycleService(CaracteristiciMotocycleRepository caracteristiciMotocycleRepository) {
        this.caracteristiciMotocycleRepository = caracteristiciMotocycleRepository;
    }
    public ResponseEntity<Motorcycle> addCaracteristiciMotorcycle(Motorcycle caracteristiciMotorcycle) {
        if (caracteristiciMotorcycle.getCategoryMotorcycle() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }
        caracteristiciMotocycleRepository.save(caracteristiciMotorcycle);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
