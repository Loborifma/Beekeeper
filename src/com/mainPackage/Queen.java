package com.mainPackage;

public class Queen {

    private final int ageQueen;
    private final int fertility;

    private final int MAX_AGE = 219;
    private final int MIN_AGE = 1;
    private final int MAX_FERTILITY = 350;
    private final int MIN_FERTILITY = 150;

    Queen(){
        this.ageQueen = MIN_AGE + (int) (Math.random()* MAX_AGE);
        this.fertility = MIN_FERTILITY + (int) (Math.random()*MAX_FERTILITY);
    }

    public int getFertility() {
        return fertility;
    }

    public int getAgeQueen() {
        return ageQueen;
    }
}
