package com.motorcycle.utils;

public enum CategoryMotorcycle {
    NAKED("NAKED"),
    SPORT("SPORT"),
    TOURING("TOURING"),
    CRUISER("CRUISER"),
    OFFROAD("OFFROAD");
    private final String category;
    CategoryMotorcycle(String category){
        this.category = category;
    }
    @Override
    public String toString(){
        return category;
    }
}
