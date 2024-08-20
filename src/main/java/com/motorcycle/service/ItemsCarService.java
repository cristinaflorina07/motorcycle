package com.motorcycle.service;

import com.motorcycle.entity.ItemsCar;
import com.motorcycle.repository.ItemsCarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemsCarService {

    private final ItemsCarRepository itemsCarRepository;

    public ItemsCarService(ItemsCarRepository itemsRepository) {
        this.itemsCarRepository = itemsRepository;
    }

    public ItemsCar addItems(ItemsCar itemsCar) {
        return itemsCarRepository.save(itemsCar);
    }

    public List<ItemsCar> getAllItemsCar() {
        return itemsCarRepository.findAll();
    }

    public Optional<ItemsCar> findItemsCarById(Long id) {
        return itemsCarRepository.findById(id);
    }

    public void deleteItemsCarById(Long id) {
        itemsCarRepository.deleteById(id);
    }
}
