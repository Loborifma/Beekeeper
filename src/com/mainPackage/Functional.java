package com.mainPackage;

import java.util.ArrayList;
import java.util.Scanner;


public class Functional {

//    Common parameters =========================================================================
    Scanner scanner = new Scanner(System.in);
    Player player = new Player();

//    Functional of store ========================================================================
    Store store = new Store();

//    Functional of sots =========================================================================
    FunctionalSots funcSots = new FunctionalSots();
    Sots sot = new Sots();

//    Functional of bees ===========================================================================
    FunctionalBees funcBees = new FunctionalBees();

//    Functional of queen ==========================================================================
    FunctionalQueen funcQueen = new FunctionalQueen();


//    Functional of game field =======================================================================

    public void choseAction() throws InterruptedException {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your actions: " +
            "\n1)Go to the store" +
            "\n2)Feed the queen" +
            "\n3)Harvest" +
            "\n4)Sell honey" +
            "\n5)Wait" +
            "\n6)Show info" +
            "\n7)Clear the screen" +
            "\n8)Leave the game\n");

    int variantOfAction = scanner.nextInt();

    switch (variantOfAction){
        case 1 :
            store.goToStore();
            break;
        case 2 :
            if(funcQueen.queens.isEmpty()){
                System.out.println("\nSorry seems you don't have the queen yet.\n");
                choseAction();
                break;
            }else {
                funcQueen.feedTheQueen();
            }
            choseAction();
            break;
        case 3 :
            funcSots.harvest();
            choseAction();
            break;
        case 4 :
            store.sellTheHoney();
            choseAction();
            break;
        case 5 :
            waitDay();
            choseAction();
            break;
        case 6 :
            showInfo();
            break;
        case 7 :
            clearScreen();
            break;
        case 8 :
            leaveGame();
            break;
        default:
            System.out.println("\nSeems you choose the wrong action!\n");
            choseAction();
    }
}

    Integer days = 0;

    public void waitDay() {
        days = days + 1;
        funcSots.accumulationHoney();
        System.out.println("\nYou wait one day\n");
    }

    Queen queenInfo = null;

    public void showInfo() throws InterruptedException {
//        Check if there is a queen and if queen alive
        if(funcQueen.queens.isEmpty()){
            System.out.println("\nYou need to buy the queen\n");
            choseAction();
        }else {
            queenInfo = funcQueen.queens.get(0);
        }
        int ageOfQueen = queenInfo.getAgeQueen() - funcQueen.counterDaysOfQueen();
        if(ageOfQueen == 1){
            funcQueen.queens.remove(0);
            funcQueen.daysLifeOfQueen = 0;
        }
//        End of check
        System.out.println("================================================");


        System.out.println("Days: " + days +"              Money :" + player.getPlayerMoney() +"$\n");
        System.out.println("Queen: " +
                "\nAge - "+ageOfQueen+" days left"+
                "\nFertility - "+queenInfo.getFertility());


        System.out.println("---------------------------------------");


        System.out.println("Bees: " +
                "\nAmount: " + funcBees.bees.size() +
                "\nCapability: " + funcBees.resultCapabilityBees());


        System.out.println("---------------------------------------");


        System.out.println("Amount of honey: " + funcSots.accumulationOfHoney + "mg" +
                "\nFree space in sots: "+sot.getCapacitySots()+ "mg");


        System.out.println("================================================\n");

        choseAction();
    }

    public void clearScreen() throws InterruptedException {
        for(int i = 0; i < 31; i++){
            System.out.println();
        }
        choseAction();
    }

    public void leaveGame(){
        System.out.println("Print \"exit\" to leave...");

        while (true){
            String isExit = scanner.nextLine();
            if(isExit.equals("exit"))
                break;
        }
    }
}
