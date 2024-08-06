package com.motorcycle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Shop {
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

    @Transient
    private Motorcycle motorcycle;




}
