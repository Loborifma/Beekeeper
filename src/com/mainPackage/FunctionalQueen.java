package com.mainPackage;

import java.util.ArrayList;

public class FunctionalQueen {

    Player player = new Player();
    Functional func = new Functional();
    FunctionalBees funcBees = new FunctionalBees();

    ArrayList<Queen> queens = new ArrayList<>();

    public Queen buyTheQueen(){
        queens.add(new Queen());
        int counter = -1;
        counter++;
        double coastOfQueen = player.getPlayerMoney() - 20;
        player.setPlayerMoney(coastOfQueen);
        System.out.println("\nCongrats, you buy the queen!\n");
        return queens.get(counter);
    }

    Integer daysLifeOfQueen = -1;

    public int counterDaysOfQueen(){
        return daysLifeOfQueen = daysLifeOfQueen + 1;
    }

    Integer counter = 0;

    public void feedTheQueen() throws InterruptedException {
        if(counter <= func.days) {
            for (int i = 0; i < queens.get(0).getFertility(); i++) {
                funcBees.bees.add(new Bees());
            }
            System.out.println("\nYou fed queen!\n");
            counter = func.days;
            counter++;
        }else {
            System.out.println("\nYour queen are full\n");
            func.choseAction();
        }
    }
}
