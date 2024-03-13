package com.JavaPratice;

public class Stringnonrepeatingcharacter {
    public static void main(String[] args) {
        String str = "mom";
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i) - 'a'] == 1) {
                System.out.println("First non-repeating character: " + str.charAt(i));
                return;
            }
        }
        System.out.println("There are no non-repeating characters in the string.");
    }
}
