package com.JavaPratice;

public class ArmstrongNumber2 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 154;
        int copy = num;
        System.out.println("The number defined to check Armstrong is: " + num);
        String n = Integer.toString(num);
        int len = n.length();
        while(num != 0) {
            int rem = num % 10;
            int mul = 1;
            for(int i = 1; i <= len; i++) {
                mul *= rem;
            }
            sum += mul;
            num /= 10;
        }
        if(sum == copy) {
            System.out.println(copy + " is a Armstrong number");
        } else {
            System.out.println(copy + " is not an Armstrong number");
        }
    }

}
