package com.JavaPratice;

import java.util.Scanner;

public class PetersonNumber2 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Range number you want to Start = ");
            int start = sc.nextInt();
            System.out.println("Enter Range number you want to End = ");
            int end = sc.nextInt();

            System.out.println("The List of Peterson Numbers from " + start + " to " + end);
            for(int i = start; i <= end; i++)
            {
                if (findPetersonNum(i) == i)
                {
                    System.out.println(i + " is a Peterson Number");
                }
            }
        }

        public static int calFactorial(int pnum) {

            if(pnum == 0 || pnum == 1)
            {
                return 1;
            }

            return pnum * calFactorial(pnum - 1);
        }

        public static int findPetersonNum(int pnum) {
            int rem, sum = 0;

            for(;pnum > 0; pnum = pnum/10)
            {
                rem = pnum % 10;
                sum = sum + calFactorial(rem);
            }
            return sum;
        }
    }


