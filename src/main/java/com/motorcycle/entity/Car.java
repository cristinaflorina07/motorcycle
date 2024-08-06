package com.motorcycle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    private String mark;
    private String model;
    private int yearOfManufacture;
    private double motorCapacity;
}
