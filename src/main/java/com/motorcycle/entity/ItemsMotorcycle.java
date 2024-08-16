package com.motorcycle.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class ItemsMotorcycle extends Items {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<Motorcycle> motorcycleList = new ArrayList<>();

    public void addMotorcycle(Motorcycle motorcycle) {
        motorcycleList.add(motorcycle);
        motorcycle.setItemsMotorcycle(this);

    }
}

