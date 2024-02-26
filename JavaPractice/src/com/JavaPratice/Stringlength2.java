package com.JavaPratice;

public class Stringlength2 {

        // main method
        public static void main(String argvs[]) {
            String str = "Welcome To Java";
            int size = str.length();

            System.out.println("Reverse of the string: " + "'" + str + "'" + " is");

            for (int i = 0; i < size; i++) {
// printing in reverse order
                System.out.print(str.charAt(str.length() - i - 1));
            }

        }
    }
