package com.JavaPratice;
import java.util.*;
import java.math.BigInteger;

public class AddLargerNumber {
    public static void main(String[] args) {
        String number1,number2;
        Scanner in =new Scanner(System.in);

        System.out.println("Enter the first large number:");
        number1=in.nextLine();

        System.out.println("Enter the second large number:");
        number2=in.nextLine();

        BigInteger first = new BigInteger(number1);
        BigInteger second= new BigInteger(number2);
        BigInteger sum;

        sum=first.add(second);

        System.out.println("Result of addition "+sum);
    }

}
