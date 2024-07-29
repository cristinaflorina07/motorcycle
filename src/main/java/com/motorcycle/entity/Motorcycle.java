package com.motorcycle.entity;

import com.motorcycle.utils.CategoryMotorcycle;
import jakarta.persistence.*;

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
    private LocalDate localDate;
    private LocalDate countDays;

    public LocalDate getCountDays() {
        return countDays;
    }

    public void setCountDays(LocalDate countDays) {
        this.countDays =countDays;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
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



