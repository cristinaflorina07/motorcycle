package com.motorcycle.service;

import com.motorcycle.entity.ItemsMotorcycle;
import com.motorcycle.repository.ItemsMotorcycleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsMotorcycleService {

    private final ItemsMotorcycleRepository itemsMotorcycleRepository;

    public ItemsMotorcycleService(ItemsMotorcycleRepository itemsMotorcycleRepository) {
        this.itemsMotorcycleRepository = itemsMotorcycleRepository;
    }

    public ItemsMotorcycle addNewMotorcycleItem(ItemsMotorcycle itemsMotorcycle) {
        return itemsMotorcycleRepository.save(itemsMotorcycle);
    }

    public List<ItemsMotorcycle> getAllMotorcycleItems() {
        return itemsMotorcycleRepository.findAll();
    }
}
