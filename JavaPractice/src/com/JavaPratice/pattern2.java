package com.JavaPratice;

import java.util.Scanner;
//Downward Triangle Star Pattern
public class pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Inner loop for rows
        for (int i = rows - 1; i >= 0; i--) {
            // Inner loop for columns
            for (int j = 0; j <= i; j++) {
                // Prints star and space
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}

