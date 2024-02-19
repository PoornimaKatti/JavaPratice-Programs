package com.JavaPratice;

import java.util.Scanner;

public class Evennumber1 {
    public static void main(String[] args) {
        int number; // variable that will represent how many elements the user wants the array to have

        Scanner s = new Scanner(System.in);

        System.out.println("How many elements would you like your array to have:");
        number = s.nextInt();
        int[] array = new int[number];

        // let the user enter the values of the array.
        for (int index = 0; index < number; index++) {
            System.out.print("Value " + (index + 1) + ": ");
            array[index] = s.nextInt();
        }
        // Print out the even indexes
        System.out.println("\nI am now going to print out the even indexes");
        for (int index = 0; index < array.length; index++) {
            if (index % 2 == 0)
                System.out.print(array[index] + " ");
        }
    }
}

