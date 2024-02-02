package com.JavaPratice;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        try (
                Scanner scanner = new Scanner(System.in)) {
            Random rand = new Random();

            System.out.print("Please enter maximum range: ");
            int maxRange = scanner.nextInt();
//This for loop runs 10 times (loop from 1 to 10).
//In each iteration, it generates a random number using rand.nextInt(maxRange) and prints it on the console.
            for (int loop = 1; loop <= 10; loop++) {
                System.out.println(rand.nextInt(maxRange));
            }
        }
    }
}
