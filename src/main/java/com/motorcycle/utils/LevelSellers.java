package com.motorcycle.utils;

public enum LevelSellers {

    LOW("LOW"),
    MEDIUM("MEDIUM"),
    HIGH("HIGH");

    private final String type;

    LevelSellers(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
