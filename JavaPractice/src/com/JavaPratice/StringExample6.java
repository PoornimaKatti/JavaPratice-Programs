package com.JavaPratice;
//Performs a series of operations
public class StringExample6 {
    public static void main(String[] args) {
        String s = new String("5");
        System.out.println(1 + 10 + s + 1 + 10);
    }
}
//1 + 10 + s + 1 + 10: Performs a series of operations:
//
//1 + 10: Evaluates to 11.
//11 + s: Since s is a String, it performs string concatenation. The result is "115" (concatenating "11" and "5").
//"115" + 1: Continues string concatenation, resulting in "1151".
//"1151" + 10: Concludes the concatenation, resulting in the final string "115110".