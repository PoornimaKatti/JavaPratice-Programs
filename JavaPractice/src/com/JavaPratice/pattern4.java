package com.JavaPratice;

import java.util.Scanner;

public class pattern4 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();

        // Outer loop for rows
        for (int i = row; i >= 1; i--) {
            // Inner loop for spaces
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            // Inner loop for stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
    }

