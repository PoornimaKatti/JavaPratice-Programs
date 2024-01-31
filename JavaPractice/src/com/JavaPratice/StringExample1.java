package com.JavaPratice;
//String is immutable example
public class StringExample1 {
    public static void main(String[] args) {

        String originalString = "Hello";
        System.out.println("Original String: " + originalString);

        String modifiedString = originalString.concat(" World");
        System.out.println("Modified String: " + modifiedString);

        // The original string remains unchanged
        System.out.println("Original String after modification: " + originalString);

    }
}
