package com.company;

import java.util.Scanner;

public class Dimensions {
    private int length,width,height;
    private double floorCost,sqftFloor;

    public Dimensions(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.floorCost = 0;
        this.sqftFloor = width * length;
    }

    private void setFloorCost(double floorCost) {
        this.floorCost = floorCost;
    }
    public String totalCost(){
        if (floorCost ==0) {
            System.out.println("Please enter a cost for the flooring:");
            Scanner scanner = new Scanner(System.in);
            this.floorCost = scanner.nextDouble();
            scanner.nextLine(); // handle next line character (enter key)
            scanner.close();
        }
        return ("Your total cost for flooring will be " + sqftFloor*floorCost +". Square feet: " + sqftFloor + " Price per sqft: " + floorCost);
    }
}
