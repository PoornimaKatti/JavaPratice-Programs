package com.JavaPratice;

public class BinarySearchAlgorithm {
    private static int binarySearch(int numArray[], int number_to_search_for) {
        //Next, we defined the low and high variables to represent the first and last index of the array:
        int low = 0;
        int high = numArray.length - 1;

//If number_to_search_for  is equal to midpoint, the midpoint index will be returned.
//If number_to_search_for is greater than midpoint, search through the elements on the right side of the midpoint.
//If number_to_search_for is less than midpoint, search through the elements on the left side  midpoint.
        while (low <= high){
            int middleIndex = (low + high) / 2;
            int middleIndexNumber = numArray[middleIndex];

            if (number_to_search_for == middleIndexNumber){
                return middleIndex;
            }
            if (number_to_search_for < middleIndexNumber){
                high = middleIndex - 1;
            }
            if (number_to_search_for > middleIndexNumber){
                low = middleIndex + 1;
            }
        }
     //   will only be relevant if step 2 is false. If  number_to_search_for doesn't exist in the array, return -1.

       // Let's simplify the steps above using diagrams:

       // This is the array we're working with: 2,3,6,8,9,13,20.

       // number_to_search_for = 13.

       // midpoint = 8.

       // low = 2.

       // high = 20.
        return -1;
    }
    public static void main(String args[]) {

        int[] arrayofnums = {2,3,6,8,9,13,20};

        System.out.println(binarySearch(arrayofnums, 13));
        // 5

    }

}

