package com.JavaPratice;
import java.util.Scanner;
import java.util.Arrays;
public class LargestofThreeNumbers {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter the 3 integers=");
        Scanner in = new Scanner(System.in);

        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();

        // Store the numbers in an array
        Integer[] numbers = {x, y, z}; // Convert to Integer array

        if(x>y && x>z)
            System.out.println("First number is largest.");

        else if(y>x && y>z)
            System.out.println("Second number is largest.");

        else if(z>x && z>y)
            System.out.println("Third number is largest.");
        else
            System.out.println("Enter numbers are not disinct.");

        // Sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Numbers in ascending order: " + Arrays.toString(numbers));

        // Sort the array in descending order
        Arrays.sort(numbers, java.util.Collections.reverseOrder());
        System.out.println("Numbers in descending order: " + Arrays.toString(numbers));
    }
}
