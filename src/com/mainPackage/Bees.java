package com.mainPackage;

public class Bees {
    private final int ageBee;
    private final int capability;

    private final int MAX_AGE = 60;
    private final int MIN_AGE = 1;
    private final int MAX_CAPABILITY = 75;
    private final int MIN_CAPABILITY = 15;

    Bees(){
        this.ageBee = MIN_AGE + (int)(Math.random()* MAX_AGE);
        this.capability = MIN_CAPABILITY + (int) (Math.random()* MAX_CAPABILITY);
    }

    public int getAgeBee() {
        return ageBee;
    }

    public int getCapability() {
        return capability;
    }
}
