package com.motorcycle.service;

import com.motorcycle.entity.ItemsMotorcycle;
import com.motorcycle.entity.Motorcycle;
import com.motorcycle.repository.ItemsMotorcycleRepository;
import com.motorcycle.repository.MotorcycleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ItemsMotorcycleService {

    private final ItemsMotorcycleRepository itemsMotorcycleRepository;
    private final MotorcycleRepository motorcycleRepository;

    public ItemsMotorcycleService(ItemsMotorcycleRepository itemsMotorcycleRepository, MotorcycleRepository motorcycleRepository) {
        this.itemsMotorcycleRepository = itemsMotorcycleRepository;
        this.motorcycleRepository = motorcycleRepository;
    }


    public ItemsMotorcycle addNewMotorcycleItem(ItemsMotorcycle itemsMotorcycle) {
        return itemsMotorcycleRepository.save(itemsMotorcycle);
    }

    public List<ItemsMotorcycle> getAllMotorcycleItems() {
        return itemsMotorcycleRepository.findAll();
    }

    public Optional<ItemsMotorcycle> findItemsMotorcycleById(Long id) {
        return itemsMotorcycleRepository.findById(id);
    }
}
