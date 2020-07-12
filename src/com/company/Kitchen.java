package com.company;

public class Kitchen {
    private Refrigerator theFridge;
    private Microwave theMicro;
    private Dishwasher theDish;

    public Kitchen(Refrigerator theFridge, Microwave theMicro, Dishwasher theDish) {
        this.theFridge = theFridge;
        this.theMicro = theMicro;
        this.theDish = theDish;
    }
}
