package com.mainPackage;

public class Queen {

    private final int ageQueen;
    private final int fertility;

    private final int MAX_AGE = 1800;
    private final int MIN_AGE = 1080;
    private final int MAX_FERTILITY = 3500;
    private final int MIN_FERTILITY = 1500;

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
