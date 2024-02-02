package com.JavaPratice;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {


            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Check if the number is a palindrome
            if (isPalindrome(number)) {
                System.out.println(number + " is a Palindrome Number.");
            } else {
                System.out.println(number + " is not a Palindrome Number.");
            }

            // Close the Scanner
            scanner.close();
        }

        // Function to check if a number is a palindrome
        public static boolean isPalindrome ( int num){
            int originalNum = num;
            int reversedNum = 0;

            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            return originalNum == reversedNum;
        }
    }
