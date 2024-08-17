package com.motorcycle.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonManagedReference
    private List<Motorcycle> motorcycleList = new ArrayList<>();

    public void addMotorcycle(Motorcycle motorcycle) {
        motorcycleList.add(motorcycle);
        motorcycle.setItemsMotorcycle(this);

    }
}

