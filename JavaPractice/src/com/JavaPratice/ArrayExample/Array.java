package com.NewJava;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr ={3,6,2,9,7};
        int a = arr.length;
        Arrays.sort(arr);
        System.out.println("Third largest number:" + arr[a-3]);

    }
}
