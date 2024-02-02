package com.JavaPratice;

public class PalindromeString {
    public static void main(String[] args) {
// Initializes a string

        String str = "level", reverseStr = "";
// Calculates the length of the input string and stores it in the variable strLength.
        int strLength = str.length();
//This loop iterates through the characters of the original string in reverse order
// and appends each character to the reverseStr string
        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

 // Compares the original string (converted to lowercase) with the reversed string (also converted to lowercase)
        // to check if they are equal. If they are equal, it prints that the string is a palindrome or not
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
