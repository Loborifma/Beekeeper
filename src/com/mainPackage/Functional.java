package com.mainPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Functional {

//    Common parameters =========================================================================

    Scanner scanner = new Scanner(System.in);





//    Functional of store =======================================================================

    Player player = new Player(20);

    public void sellTheHoney(){
        double money = sot.getCapacitySots() * 0.00001;
        player.setPlayerMoney(money);
        sot.setCapacitySots(4_500_000);
    }

    public void goToStore() throws InterruptedException {
        System.out.println("\n1)Bee-queen - 20$" +
                           "\n2)Leave the store");

        int variationOfAction = scanner.nextInt();

        switch (variationOfAction){
            case 1:
                if(queens.size() > 1){
                    System.out.println("You cant create more then 1 queen");
                }else {
                    buyTheQueen();
                }
                showInfo();
                break;
            case 2:
                choseAction();
                break;
        }
    }





//    Functional of sots =======================================================================

    Sots sot = new Sots(4_500_000);

    public void harvest(){
        int sumOfHoney = sot.getCapacitySots() - accumulationOfHoney;
        sot.setCapacitySots(sumOfHoney);
        accumulationOfHoney = 0;
    }

    Integer accumulationOfHoney = 0;

    public void accumulationHoney(){
        accumulationOfHoney = accumulationOfHoney + resultCapabilityBees();
    }





//    Functional of bees ========================================================================

    ArrayList<Bees> bees = new ArrayList<>();

    public int resultCapabilityBees(){
        int result = 0;
        for (Bees bee : bees) {
            result = result + bee.getCapability();
        }
        return result;
    }





//    Functional of queen =============================================================================

    ArrayList<Queen> queens = new ArrayList<>();

    public Queen buyTheQueen(){
        queens.add(new Queen());
        int counter = -1;
        counter++;
        double coastOfQueen = player.getPlayerMoney() - 20;
        player.setPlayerMoney(coastOfQueen);
        return queens.get(counter);
    }

    Integer daysLifeOfQueen = -1;

    public int counterDaysOfQueen(){
        return daysLifeOfQueen = daysLifeOfQueen + 1;
    }

    Integer counter = 0;

    public void feedTheQueen() throws InterruptedException {
        if(counter.equals(days)) {
            for (int i = 0; i < queens.get(0).getFertility(); i++) {
                bees.add(new Bees());
            }
            counter++;
        }else {
            System.out.println("\nYour queen are full\n");
            choseAction();
        }
    }





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
            "\n8)Leave the game");

    int variantOfAction = scanner.nextInt();

    switch (variantOfAction){
        case 1 :
            goToStore();
            break;
        case 2 :
            if(queens.isEmpty()){
                System.out.println("\nSorry seems you don't have the queen yet.\n");
                choseAction();
                break;
            }else {
                feedTheQueen();
            }
            showInfo();
            break;
        case 3 :
            harvest();
            showInfo();
            break;
        case 4 :
            sellTheHoney();
            showInfo();
            break;
        case 5 :
            waitDay();
            showInfo();
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
    }
}

    Integer days = 0;

    public void waitDay() {
        days = days + 1;
        accumulationHoney();
    }

    Queen queenInfo = null;

    public void showInfo() throws InterruptedException {
//        Check if there is a queen and if queen alive
        if(queens.isEmpty()){
            System.out.println("\nYou need to buy the queen\n");
            choseAction();
        }else {
            queenInfo = queens.get(0);
        }
        int ageOfQueen = queenInfo.getAgeQueen() - counterDaysOfQueen();
        if(ageOfQueen == 1){
            queens.remove(0);
            daysLifeOfQueen = 0;
        }
//        End of check
        System.out.println("================================================");


        System.out.println("Days: " + days +"              Money :" + player.getPlayerMoney() +"$\n");
        System.out.println("Queen: " +
                "\nAge - "+ageOfQueen+" days left"+
                "\nFertility - "+queenInfo.getFertility());


        System.out.println("---------------------------------------");


        System.out.println("Bees: " +
                "\nAmount: " + bees.size() +
                "\nCapability: " + resultCapabilityBees());


        System.out.println("---------------------------------------");


        System.out.println("Amount of honey: " + accumulationOfHoney + "mg" +
                "\nFree space in sots: "+sot.getCapacitySots()+ "mg");


        System.out.println("================================================\n");

        Thread.sleep(2000);

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
