package com.JavaPratice;

import java.util.Arrays;
//Anagrams are words or phrases that have the same letters rearranged to form different words or phrases.
// For instance, "listen" and "silent" are anagrams of each other.
public class Stringanagrams {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
