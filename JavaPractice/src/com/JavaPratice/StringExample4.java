package com.JavaPratice;
//String Pool example
public class StringExample4 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3="world";
        System.out.println(str1 == str2);
        System.out.println(str2==str3);
    }

}
