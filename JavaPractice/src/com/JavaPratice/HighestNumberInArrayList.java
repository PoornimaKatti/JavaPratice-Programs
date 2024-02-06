package com.JavaPratice;

    import java.util.ArrayList;

    public class HighestNumberInArrayList {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(10);
            numbers.add(5);
            numbers.add(20);
            numbers.add(15);
            numbers.add(25);

            int highest = Integer.MIN_VALUE; // Initialize with the smallest possible integer value

            // Iterate through the ArrayList to find the highest number
            for (int number : numbers) {
                if (number > highest) {
                    highest = number;
                }
            }

            System.out.println("Highest number in the ArrayList: " + highest);
        }
    }


