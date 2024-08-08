package com.motorcycle.service;

import com.motorcycle.entity.ItemsCar;
import com.motorcycle.repository.ItemsCarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
