package com.JavaPratice;

import java.util.Scanner;

public class Operator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a number to find its square root: ");
        double number = scanner.nextDouble();
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root: " + squareRoot);
    }
}
