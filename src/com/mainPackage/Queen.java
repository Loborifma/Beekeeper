package com.mainPackage;

import java.util.Random;

public class Queen {

    private int ageQueen;
    private boolean fertility;

    Random random = new Random(1);

    int max = 2190;
    int min = 1;

    Queen(){
        this.ageQueen = min + (int) (Math.random()*max);
        this.fertility = true;
    }

    public boolean isFertility() {
        return fertility;
    }

    public int getAgeQueen() {
        return ageQueen;
    }
}
