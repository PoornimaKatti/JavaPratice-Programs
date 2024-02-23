package com.JavaPratice;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: Finding the maximum of two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double max = Math.max(num1, num2);
        System.out.println("Maximum: " + max);
    }
}
