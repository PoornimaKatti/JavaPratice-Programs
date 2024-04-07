package com.NewJava;
import java.util.Scanner;
public class Removetheduplicates {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Step 1: Get the input phone number
            System.out.print("Enter the phone number: ");
            String phoneNumber = scanner.nextLine();

            // Step 2: Remove duplicates
            String cleanedPhoneNumber = removeDuplicates(phoneNumber);

            // Step 3: Output the modified phone number
            System.out.println("Phone number after removing duplicates: " + cleanedPhoneNumber);

            scanner.close();
        }

        // Function to remove duplicate digits from a phone number
        public static String removeDuplicates(String phoneNumber) {
            StringBuilder cleanedNumber = new StringBuilder();

            // Step 4: Iterate through each digit of the phone number
            for (char digit : phoneNumber.toCharArray()) {
                // Step 5: Check if the current digit is already present in the cleaned number
                if (cleanedNumber.indexOf(String.valueOf(digit)) == -1) {
                    // Step 6: If not present, append it to the cleaned number
                    cleanedNumber.append(digit);
                }
            }

            return cleanedNumber.toString();
        }
    }


