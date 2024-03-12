package com.JavaPratice;

import java.util.Scanner;

public class PetersonNumber {

/* A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.
 we have to check the number (n) 145 is Peterson or not.
Eg: Number = 145
    145 = !1 + !4 + !5
    145=1+4*3*2*1+5*4*3*2*1
       =1+24+120
    145=145 */

        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            //taking input from the user
            System.out.println("Enter the number:");
            int num=sc.nextInt();
            int temp=num;//storing the number in a temporary variable
            int f=1,sum=0;
            while(num!=0)//running while loop until number becomes zero
            {
                f=1;
                //extracting last digit of the number
                //and storing in r
                int r=num%10;
                //for loop to find the factorial of a digit
                for(int i=1;i<=r;i++)
                {
                    f=f*i;
                }
                sum=sum+f;//adding the factotial of the digits
                num=num/10;
            }
            //checking if the sum of the factorial of digits
            //is equal to the number or not
            if(sum==temp)
                System.out.println("PETERSON NUMBER");
            else
                System.out.println("NOT PETERSON NUMBER");
        }
    }

