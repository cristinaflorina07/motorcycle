package com.motorcycle.utils;

import com.motorcycle.entity.Motorcycle;
import com.motorcycle.repository.MotorcycleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DatingUtilsService {
    private final MotorcycleRepository motorcycleRepository;

    public DatingUtilsService(MotorcycleRepository motorcycleRepository) {
        this.motorcycleRepository = motorcycleRepository;
    }

    public void calculateDays() {
        List<Motorcycle> listMoto = motorcycleRepository.findAll();
        LocalDate now = LocalDate.now();
        for (Motorcycle motorcycle : listMoto) {
            motorcycle.setCountDays(now.getDayOfYear() - motorcycle.getRegisterDate().getDayOfYear());
        }
        motorcycleRepository.saveAll(listMoto);
    }
}
