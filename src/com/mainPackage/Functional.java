package com.mainPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Functional {

    ArrayList<Queen> queens = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Queen createQueen(){
        queens.add(new Queen());
        int counter = -1;
        counter++;
        return queens.get(counter);
    }

    public void showInfo(){
        System.out.println("================================================");
        Queen queenInfo = queens.get(0);
        System.out.println("Queen: " +
                "\nAge - "+queenInfo.getAgeQueen()+" days"+
                "\nFertility - "+queenInfo.isFertility());
        System.out.println("---------------------------------------");
    }

    public void clearScreen(){
                for(int i = 0; i < 31; i++){
                    System.out.println();
                }
        choseAction();
    }

    public void choseAction(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your actions: " +
                "\n1)Create queen" +
                "\n2)Feed the queen" +
                "\n3)Harvest" +
                "\n4)Wait" +
                "\n5)Clear" +
                "\n6)Leave");

        Integer variantOfAction = scanner.nextInt();

         switch (variantOfAction){
            case 1 :
                if(queens.size() > 1){
                    System.out.println("You cant create more then 1 queen");
                }else {
                    createQueen();
                }
                break;
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                clearScreen();
                break;
            case 6 :
                leaveGame();
                break;
        }
            if(variantOfAction != 6){
                showInfo();
            }


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
