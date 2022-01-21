package com.mainPackage;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("What is your actions: " +
                "\n1)Create Bee" +
                "\n2)Feed the queen" +
                "\n3)Harvest" +
                "\n4)Wait" +
                "\n5)Check bees" +
                "\n6)Check sots" +
                "\n7)Check queen");

        Functional functional = new Functional();

        Scanner scanner = new Scanner(System.in);

        Integer variantOfAction = scanner.nextInt();

        switch (variantOfAction){
            case 1 :
                functional.createBees();
                break;
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println(functional.bees);
                break;
            case 6 :

        }

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
