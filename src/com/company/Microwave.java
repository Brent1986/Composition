package com.company;

public class Microwave {
    private int watts;
    private int size;
    private boolean isProgrammable;

    public Microwave(int watts, int size, boolean hasIceMaker) {
        this.watts = watts;
        this.size = size;
        this.isProgrammable = hasIceMaker;
    }

    public void powerButtonPress(){
        System.out.println("Power Button Pressed... ");
        startCooking();
    }
    private void startCooking() {
        System.out.println("Food is cooking!");
    }
}
