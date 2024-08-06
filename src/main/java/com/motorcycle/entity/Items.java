package com.motorcycle.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Items {
    @Id
    @GeneratedValue
    private Long id;
    private double price;
    private int quantity;
    private double km;
    private String gearBox;
    private String descriptions;
    private double power;
    private String fuelType;

    @OneToMany
    private List<Motorcycle> motorcycle;




}
