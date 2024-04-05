package com.JavaProgram;
import java.util.Scanner;
public class Convert {
  public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Step 1: Get the input number
            System.out.print("Enter a two-digit number (1 to 99): ");
            int number = scanner.nextInt();

            // Step 2: Convert the number to its word representation
            String word = convertToWord(number);

            // Step 3: Output the word representation
            System.out.println("In words: " + word);

            scanner.close();
        }

        // Function to convert a two-digit number to its word representation
        public static String convertToWord(int number) {
            if (number < 1 || number > 99) {
                return "Number out of range";
            }

            String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
            String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

            // Convert the number to a string and then to a character array
            char[] digits = String.valueOf(number).toCharArray();

            // Handle the conversion based on the number of digits
            if (digits.length == 1) {
                return ones[number];
            } else if (digits.length == 2) {
                if (number < 20) {
                    return teens[number - 10];
                } else {
                    int tensDigit = digits[0] - '0'; // Convert char to int
                    int onesDigit = digits[1] - '0'; // Convert char to int
                    return tens[tensDigit] + (onesDigit != 0 ? " " + ones[onesDigit] : "");
                }
            }

            return "Invalid number";
        }
    }


