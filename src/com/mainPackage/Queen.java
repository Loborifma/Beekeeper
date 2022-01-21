package com.mainPackage;

import java.util.Random;

public class Queen {

    private int ageQueen;
    private boolean fertility;

    Random random = new Random(1);

    Queen(){
        this.ageQueen = random.nextInt(6);
        this.fertility = true;
    }
}
