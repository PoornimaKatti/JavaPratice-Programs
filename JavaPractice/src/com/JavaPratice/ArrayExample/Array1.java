package com.NewJava;
import java.util.Arrays;
public class Array1 {

        public static void main(String[] args) {
            int[] arr = { 3, 6, 2, 9, 7 };

            // Sort the array in descending order
            Arrays.sort(arr);
            // Reverse the array
            int n = arr.length;
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            }

            // Access the 3rd highest number
            int thirdHighest = arr[2];

            System.out.println("The 3rd highest number is: " + thirdHighest);
        }
    }


