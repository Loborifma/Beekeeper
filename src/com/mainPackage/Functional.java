package com.mainPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Functional {

//    Common parameters =========================================================================

    Scanner scanner = new Scanner(System.in);




//    Functional of sots =======================================================================

    Sots sot = new Sots(4_500_000);

    public void harvest(){
        int sumOfHoney = sot.getCapacitySots() - resultCapabilityBees();
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
        for(int i = 0; i < bees.size(); i++){
            result = result + bees.get(i).getCapability();
        }
        return result;
    }





//    Functional of queen =============================================================================

    ArrayList<Queen> queens = new ArrayList<>();

    public Queen createQueen(){
        queens.add(new Queen());
        int counter = -1;
        counter++;
        return queens.get(counter);
    }

    Integer daysLifeOfQueen = -1;

    public int counterDaysOfQueen(){
        return daysLifeOfQueen = daysLifeOfQueen + 1;
    }

    Integer counter = 0;

    public void feedTheQueen(){
        if(counter == days) {
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

    public void choseAction(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your actions: " +
            "\n1)Create queen" +
            "\n2)Feed the queen" +
            "\n3)Harvest" +
            "\n4)Wait" +
            "\n5)Show info" +
            "\n6)Clear the screen" +
            "\n7)Leave");

    int variantOfAction = scanner.nextInt();

    switch (variantOfAction){
        case 1 :
            if(queens.size() > 1){
                System.out.println("You cant create more then 1 queen");
            }else {
                createQueen();
            }
            showInfo();
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
            waitDay();
            showInfo();
            break;
        case 5 :
            showInfo();
            break;
        case 6 :
            clearScreen();
            break;
        case 7 :
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

    public void showInfo(){
//        Check if there is a queen and if queen alive
        if(queens.isEmpty()){
            System.out.println("\nYou need to create the queen\n");
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
        System.out.println("Days: " + days +"\n");
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
        System.out.println("---------------------------------------");

        choseAction();
    }

    public void clearScreen(){
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
