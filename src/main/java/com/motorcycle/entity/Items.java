package com.motorcycle.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@MappedSuperclass
public class Items {

    private double price;
    private int quantity;
    private double km;
    private String gearBox;
    private String descriptions;
    private double power;
    private String fuelType;

}
