package com.mainPackage;

public class FunctionalSots {

    Sots sot = new Sots();
    FunctionalBees funcBees = new FunctionalBees();
    Player player = new Player();

    public void harvest(){
        if(accumulationOfHoney <= sot.getCapacitySots()) {
            int sumOfHoney = sot.getCapacitySots() - accumulationOfHoney;
            sot.setCapacitySots(sumOfHoney);
            accumulationOfHoney = 0;
        }else {
            int remainder = accumulationOfHoney - sot.getCapacitySots();
            sot.setCapacitySots(0);
            accumulationOfHoney = remainder;
        }
        System.out.println("\nYou harvest the honey!\n");
    }

    Integer accumulationOfHoney = 0;

    public void accumulationHoney(){
        accumulationOfHoney = accumulationOfHoney + funcBees.resultCapabilityBees();
    }

    public void updateSots(){
        if(player.getPlayerMoney() >= 6.5) {
            double coast = player.getPlayerMoney() - 6.5;
            player.setPlayerMoney(coast);
            int capacity = sot.getCapacitySots() + 4_500_000;
            sot.setCapacitySots(capacity);
            sot.setInitialCapacitySots(capacity);
            System.out.println("\nYour sots was updated (+4_500_000)\n");
        }else {
            System.out.println("\n Not enough money\n");
        }
    }
}
