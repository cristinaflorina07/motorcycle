package com.motorcycle.service;

import com.motorcycle.entity.Motorcycle;
import com.motorcycle.repository.MotocycleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorcycleService {

    private final MotocycleRepository caracteristiciMotocycleRepository;

    public MotorcycleService(MotocycleRepository caracteristiciMotocycleRepository) {
        this.caracteristiciMotocycleRepository = caracteristiciMotocycleRepository;
    }
    public ResponseEntity<Motorcycle> addCaracteristiciMotorcycle(Motorcycle caracteristiciMotorcycle) {
        if (caracteristiciMotorcycle.getCategoryMotorcycle() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }
        caracteristiciMotocycleRepository.save(caracteristiciMotorcycle);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    public List<Motorcycle> getAllMotorcycle() {
        return caracteristiciMotocycleRepository.findAll();
    }
}
