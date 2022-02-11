package com.mainPackage;

public class Bees {
    private final int capability;

    private final int MAX_CAPABILITY = 75;
    private final int MIN_CAPABILITY = 15;

    Bees(){
        this.capability = MIN_CAPABILITY + (int) (Math.random()* MAX_CAPABILITY);
    }

    public int getCapability() {
        return capability;
    }
}
