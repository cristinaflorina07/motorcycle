package com.motorcycle.service;

import com.motorcycle.entity.Motorcycle;
import com.motorcycle.repository.MotocycleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotorcycleService {

    private final MotocycleRepository motocycleRepository;

    public MotorcycleService(MotocycleRepository motocycleRepository) {
        this.motocycleRepository = motocycleRepository;
    }
    public Optional<Motorcycle> findMotorcycleBy(Long id){
        return motocycleRepository.findById(id);

    }

    public ResponseEntity<Motorcycle> addCaracteristiciMotorcycle(Motorcycle caracteristiciMotorcycle) {
        if (caracteristiciMotorcycle.getCategoryMotorcycle() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }
        motocycleRepository.save(caracteristiciMotorcycle);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    public List<Motorcycle> getAllMotorcycle() {
        return motocycleRepository.findAll();
    }
}




