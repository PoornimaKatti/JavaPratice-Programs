package com.NewJava;
import java.util.Scanner;
public class Convert {


        private static final String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        private static final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        public static String convertToWords(int number) {
            if (number < 10) {
                return units[number];
            } else if (number < 20) {
                return teens[number - 10];
            } else {
                return tens[number / 10] + " " + units[number % 10];
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a two-digit number: ");
            int number = scanner.nextInt();

            if (number < 10 || number > 99) {
                System.out.println("Please enter a valid two-digit number.");
            } else {
                System.out.println(convertToWords(number));
            }
        }
    }


