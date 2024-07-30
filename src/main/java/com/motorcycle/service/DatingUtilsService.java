package com.motorcycle.service;

import com.motorcycle.entity.Motorcycle;
import com.motorcycle.repository.MotocycleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DatingUtilsService {
    private final MotocycleRepository motocycleRepository;

    public DatingUtilsService(MotocycleRepository motocycleRepository) {
        this.motocycleRepository = motocycleRepository;
    }

    public void calculateDays() {
        List<Motorcycle> listMoto = motocycleRepository.findAll();
        LocalDate now = LocalDate.now();
        for (Motorcycle motorcycle : listMoto) {
            motorcycle.setCountDays(now.getDayOfYear() - motorcycle.getRegisterDate().getDayOfYear());
        }
        motocycleRepository.saveAll(listMoto);
    }
}
