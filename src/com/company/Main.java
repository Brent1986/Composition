package com.company;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(11, 20, 8);
        Refrigerator theFridge = new Refrigerator(2,true,true,"Kenmore");
        Microwave theMicro = new Microwave(1000,30,true);
        Dishwasher theDish = new Dishwasher("Stainless Steel",20,30);

        theMicro.powerButtonPress();
        System.out.println(dimensions.totalCost());
        System.out.println(theFridge.getModel());
        theFridge.makeIce();
    }
}
