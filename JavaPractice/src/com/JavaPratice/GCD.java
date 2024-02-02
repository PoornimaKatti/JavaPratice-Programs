package com.JavaPratice;

import java.util.Scanner;

//The GCD (Greatest Common Divisor) of two numbers is
// the largest positive integer number that divides both the numbers without leaving any remainder.
// For example. GCD of 30 and 45 is 15. GCD also is known as HCF (Highest Common Factor).
public class GCD {
    public static void main(String[] args) {


        try (
                Scanner scanner = new Scanner(System.in)) {
            int num1, num2;
            System.out.print("Enter first number:");
            num1 = (int) scanner.nextInt();

            System.out.print("Enter second number:");
            num2 = (int) scanner.nextInt();

            // closing the scanner to avoid memory leaks
            scanner.close();
            while (num1 != num2) {
                if (num1 > num2)
                    num1 = num1 - num2;
                else
                    num2 = num2 - num1;
            }

            // displaying the result
            System.out.printf("GCD of given numbers is: %d", num2);
        }
    }
}


