package com.motorcycle.service;

import com.motorcycle.entity.Motorcycle;
import com.motorcycle.repository.MotorcycleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotorcycleService {

    private final MotorcycleRepository motorcycleRepository;

    public MotorcycleService(MotorcycleRepository motorcycleRepository) {
        this.motorcycleRepository = motorcycleRepository;
    }

    public Optional<Motorcycle> findMotorcycleById(Long id) {
        return motorcycleRepository.findById(id);

    }

    public ResponseEntity<Motorcycle> addMotorcycle(Motorcycle motorcycle) {
        if (motorcycle.getCategoryMotorcycle() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }
        motorcycleRepository.save(motorcycle);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    public List<Motorcycle> getAllMotorcycle() {
        return motorcycleRepository.findAll();
    }
}




