package com.mainPackage;

import java.io.Console;
import java.util.ArrayList;

public class Functional {

    ArrayList<Bees> bees = new ArrayList<>();


    public boolean createBees() {
        return bees.add(new Bees());
    }


}
