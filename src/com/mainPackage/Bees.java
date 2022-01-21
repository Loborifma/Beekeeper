package com.mainPackage;

import java.util.Random;

public class Bees {
    private int ageBee;
    private int capability;

    Random random = new Random(1);

    Bees(){
        this.ageBee = random.nextInt(60);
        this.capability = random.nextInt(5);
    }

    public int getAgeBee() {
        return ageBee;
    }

    public int getCapability() {
        return capability;
    }
}
