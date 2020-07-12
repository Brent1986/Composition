package com.company;

public class Refrigerator {
    private int doors;
    private boolean hasTopFreezer;
    private boolean hasIceMaker;
    private String model;

    public Refrigerator(int doors, boolean hasTopFreezer, boolean hasIceMaker, String model) {
        this.doors = doors;
        this.hasTopFreezer = hasTopFreezer;
        this.hasIceMaker = hasIceMaker;
        this.model = model;
    }
    public void makeIce(){
        System.out.println("Okay!, your " + model + " refrigerator is making ice.");
    }
    public String getModel() {
        return model;
    }
}
