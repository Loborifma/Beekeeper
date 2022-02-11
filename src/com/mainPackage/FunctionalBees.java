package com.mainPackage;

import java.util.ArrayList;

public class FunctionalBees {
    ArrayList<Bees> bees = new ArrayList<>();

    public int resultCapabilityBees(){
        int result = 0;
        for (Bees bee : bees) {
            result = result + bee.getCapability();
        }
        return result;
    }
}
