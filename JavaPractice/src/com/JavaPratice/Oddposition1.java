package com.JavaPratice;

public class Oddposition1 {
    public static void main(String[] args)
    {
        // Initialized array
        int inputArray[] = new int[] {12, 23, 11, 64, 5, 87, 22, 67, 100};

        System.out.println("Existing array elements ..");

        for (int i = 0; i < inputArray.length; i++) {

            System.out.println(inputArray[i]);
        }

        System.out.println(
                "Array elements at odd position..");

        // Though the logic looks like taking even position,
        // if 10,20,30,40,50 are elements we need to get
        // 10,30,50. So followed the logic like this
        for (int i = 0; i < inputArray.length; i++) {

            if (i % 2 == 0) {

                System.out.println(inputArray[i]);
            }
        }
    }

}
