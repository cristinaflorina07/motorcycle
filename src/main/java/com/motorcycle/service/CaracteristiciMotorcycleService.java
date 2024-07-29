package com.motorcycle.service;

import com.motorcycle.entity.Motorcycle;
import com.motorcycle.repository.CaracteristiciMotocycleRepository;
import com.motorcycle.utils.CategoryMotorcycle;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CaracteristiciMotorcycleService {

    private CaracteristiciMotocycleRepository caracteristiciMotocycleRepository;

    public CaracteristiciMotorcycleService(CaracteristiciMotocycleRepository caracteristiciMotocycleRepository) {
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
