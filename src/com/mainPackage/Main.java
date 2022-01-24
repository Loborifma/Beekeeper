package com.mainPackage;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Functional functional = new Functional();

        System.out.println("Welcome in Beekeeper\n" +
                "First of all you need to buy the bee-queen.\n" +
                "Happily you find in yours pockets about 20$\n");

        Thread.sleep(1000);

        functional.choseAction();

    }
}
