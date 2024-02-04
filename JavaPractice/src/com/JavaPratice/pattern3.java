package com.JavaPratice;

import java.util.Scanner;
//Reverse Pyramid Star Pattern
public class pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop for rows
        for (int i = 0; i <= rows - 1; i++) {
            // Inner loop for spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            // Inner loop for stars
            for (int k = 0; k <= rows - 1 - i; k++) {
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }

}
