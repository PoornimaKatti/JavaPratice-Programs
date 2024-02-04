package com.JavaPratice;
// Pyramid Star Pattern
import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    // Ask the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
    int row = scanner.nextInt();

    // Outer loop for rows
        for (int i = 0; i < row; i++) {
        // Inner loop for spaces
        for (int j = row - i; j > 1; j--) {
            System.out.print(" ");
        }
        // Inner loop for columns
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }
        // Move to the next line after printing each row
        System.out.println();
    }

    // Close the scanner
        scanner.close();
}
}

