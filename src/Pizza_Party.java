/*
 *  UCF COP3330 Fall 2021 Assignment 1.8 Solution
 *  Copyright 2021 Ronald Lemus
 */

import java.util.Scanner;

public class Pizza_Party {
    public static void main(String[] args){
        System.out.print("How many people? ");
        Scanner peopleInp = new Scanner(System.in);
        int people = peopleInp.nextInt();

        System.out.print("How many pizzas do you have? ");
        Scanner pizzaInp = new Scanner(System.in);
        int pizzas = pizzaInp.nextInt();

        System.out.print("How many slices per pizza? ");
        Scanner slicesInp = new Scanner(System.in);
        int slices = slicesInp.nextInt();
        int slicesTotal = slices * pizzas;
        int slicesPer = slicesTotal / people;
        int slicesLeft = slicesTotal % people;

        System.out.printf("%d people with %d pizzas (%d slices)\n", people, pizzas, slicesTotal);
        System.out.printf("Each person gets %d pieces of pizza.\n", slicesPer);
        System.out.printf("There are %d leftover pieces.", slicesLeft);


    }
}
