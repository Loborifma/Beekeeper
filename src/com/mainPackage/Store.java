package com.mainPackage;

import java.util.Scanner;

public class Store {
    Scanner scanner = new Scanner(System.in);
    Sots sot = new Sots();
    FunctionalQueen funcQueen = new FunctionalQueen();
    Functional func = new Functional();
    FunctionalSots funcSots = new FunctionalSots();

    Player player = new Player();

    public void sellTheHoney(){
        double money = ((sot.getInitialCapacitySots() - sot.getCapacitySots()) * 0.00001) + player.getPlayerMoney();
        player.setPlayerMoney(money);
        int capacity = sot.getInitialCapacitySots();
        sot.setCapacitySots(capacity);
        System.out.println("\nYou sell honey from sots\n");
    }

    public void goToStore() throws InterruptedException {
        System.out.println("\n1)Bee-queen - 20$" +
                "\n2)Update the sots - 6.5$" +
                "\n3)Leave the store");

        int variationOfAction = scanner.nextInt();

        switch (variationOfAction){
            case 1:
                if(funcQueen.queens.size() > 1){
                    System.out.println("You cant create more then 1 queen");
                }else {
                    funcQueen.buyTheQueen();
                }
                func.showInfo();
                break;
            case 2:
                funcSots.updateSots();
                func.showInfo();
                break;
            case 3:
                func.choseAction();
                break;
        }
    }
}
