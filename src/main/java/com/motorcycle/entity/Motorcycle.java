package com.motorcycle.entity;

import com.motorcycle.utils.CategoryMotorcycle;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Entity
public class Motorcycle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Enumerated(EnumType.STRING)
    private Long id;

    private CategoryMotorcycle categoryMotorcycle;
    private String model;
    private int yearOfManufacture;
    private int motorCapacity;
    private boolean abs;
    private LocalDate registerDate;
    private int countDays;

    public int getCountDays() {
        return countDays;
    }

    public void setCountDays(int countDays) {
        this.countDays = countDays;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

//    @OneToMany(mappedBy = "motorcycle", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<BestSellers> bestSellersSet;
//
//    private LocalDateTime dateAdded;
//    @PrePersist
//    protected void onCreate(){
//        dateAdded = LocalDateTime.now();
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CategoryMotorcycle getCategoryMotorcycle() {
        return categoryMotorcycle;
    }

    public void setCategoryMotorcycle(CategoryMotorcycle category) {
        this.categoryMotorcycle = category;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getMotorCapacity(int i) {
        return motorCapacity;
    }

    public void setMotorCapacity(int motorCapacity) {
        this.motorCapacity = motorCapacity;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public int getMotorCapacity() {
        return motorCapacity;
    }

//    public Set<BestSellers> getBestSellersSet() {
//        return bestSellersSet;
//    }
//
//    public void setBestSellersSet(Set<BestSellers> bestSellersSet) {
//        this.bestSellersSet = bestSellersSet;
//    }
//
//    public LocalDateTime getDateAdded() {
//        return dateAdded;
//    }
//
//    public void setDateAdded(LocalDateTime dateAdded) {
//        this.dateAdded = dateAdded;
//    }
}



