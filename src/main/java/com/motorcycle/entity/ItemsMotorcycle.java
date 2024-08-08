package com.motorcycle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class ItemsMotorcycle extends Items{
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany
    private List<Motorcycle> motorcycleList;
}
