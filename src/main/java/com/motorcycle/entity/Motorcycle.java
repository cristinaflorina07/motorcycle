package com.motorcycle.entity;

import com.motorcycle.utils.CategoryMotorcycle;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Motorcycle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private CategoryMotorcycle categoryMotorcycle;
    private String model;
    private int yearOfManufacture;
    private int motorCapacity;
    private boolean abs;
    private LocalDate registerDate;
    private int countDays;
}



