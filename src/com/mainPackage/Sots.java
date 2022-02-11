package com.mainPackage;

public class Sots {

    private int capacitySots;
    private int initialCapacitySots;

    public Sots() {
        this.capacitySots = 4_500_000;
        this.initialCapacitySots = 4_500_000;
    }

    public int getCapacitySots() {
        return capacitySots;
    }

    public void setCapacitySots(int capacitySots) {
        this.capacitySots = capacitySots;
    }

    public int getInitialCapacitySots(){
        return initialCapacitySots;
    }

    public void setInitialCapacitySots(int initialCapacitySots){
        this.initialCapacitySots = initialCapacitySots;
    }
}
