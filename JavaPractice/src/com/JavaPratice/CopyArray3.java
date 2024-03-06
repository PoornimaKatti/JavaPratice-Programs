package com.JavaPratice;

import java.util.Arrays;

public class CopyArray3 {

        public static void main(String[] args)
        {
            // Custom input array
            int a[] = { 1, 8, 3 };

            // Create an array b[] of same size as a[]
            // Copy elements of a[] to b[]
            int b[] = Arrays.copyOf(a, 3);

            // Change b[] to verify that
            // b[] is different from a[]
            b[0]++;

            System.out.println("Contents of a[] ");

            // Iterating over array. a[]
            for (int i = 0; i < a.length; i++)
                System.out.print(a[i] + " ");

            System.out.println("\n\nContents of b[] ");

            // Iterating over array b[]
            for (int i = 0; i < b.length; i++)
                System.out.print(b[i] + " ");
        }
    }

