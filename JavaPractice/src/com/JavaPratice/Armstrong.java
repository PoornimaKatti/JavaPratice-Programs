package com.JavaPratice;
import java.util.Scanner;
public class Armstrong {


        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a number
            System.out.print("Enter a number to check for Armstrong property: ");
            int num = scanner.nextInt();

            // Check if the entered number is an Armstrong number
            if (isArmstrong(num)) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number.");
            }

            // Close the Scanner to avoid resource leaks
            scanner.close();
        }
        private static boolean isArmstrong(int num) {
            int original = num;
            int numberOfDigits = String.valueOf(num).length();
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, numberOfDigits);
                num /= 10;
            }

            return sum == original;
        }
    }

//Sample First Iteration (num = 153):
//Extract the last digit (digit = 3).
//Add 3^3 to the sum (sum += Math.pow(3, 3)).
//Update num by removing the last digit (num = 15).
//Second Iteration (num = 15):
//
//Extract the last digit (digit = 5).
//Add 5^3 to the sum (sum += Math.pow(5, 3)).
//Update num by removing the last digit (num = 1).
//Third Iteration (num = 1):
//
//Extract the last digit (digit = 1).
//Add 1^3 to the sum (sum += Math.pow(1, 3)).
//Update num by removing the last digit (num = 0).
//The loop stops since num is now 0.

