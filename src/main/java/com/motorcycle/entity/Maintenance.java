package com.motorcycle.entity;

import java.util.Scanner;

public class Maintenance {
    private String type;
    private double price;
    private String time;

    {
        Scanner scanner = new Scanner(System.in);
        int maintenance = scanner.nextInt();
        String typeOfMaintenance;
        switch (maintenance) {
            case 1:
                typeOfMaintenance = "Preventive maintenance";
                break;
            case 2:
                typeOfMaintenance = "Oil and filer change";
                break;
            case 3:
                typeOfMaintenance = "All revision";
                break;
            default:
                typeOfMaintenance = "No maintenance";
        }
    }
}
