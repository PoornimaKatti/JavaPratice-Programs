package com.JavaPratice;

public class CopyArray2 {

        public static void main(String[] args)
        {
            // Custom input array
            int a[] = { 1, 8, 3 };
            // Creating an array b[] of same size as a[]
            int b[] = new int[a.length];
            // Copying elements of a[] to b[]
            System.arraycopy(a, 0, b, 0, 3);
            // Changing b[] to verify that
            // b[] is different from a[]
            b[0]++;
            // Display message only
            System.out.println("Contents of a[] ");

            for (int i = 0; i < a.length; i++)
                System.out.print(a[i] + " ");
            // Display message only
            System.out.println("\n\nContents of b[] ");

            for (int i = 0; i < b.length; i++)
                System.out.print(b[i] + " ");
        }
    }

