package com.JavaPratice;

import java.util.Scanner;

public class Operator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // Finding the absolute value of a number
        System.out.print("\nEnter a number to find its absolute value: ");
        double value = scanner.nextDouble();
        double absValue = Math.abs(value);
        System.out.println("Absolute value: " + absValue);

    }
}
