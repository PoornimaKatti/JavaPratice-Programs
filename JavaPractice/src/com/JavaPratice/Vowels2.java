package com.JavaPratice;

import java.util.Scanner;
import java.util.*;
public class Vowels2 {



        public static void main(String []args)
        {
            //Take input from the user
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String: ");
            String str=sc.nextLine();    //Initialize the String
            int vcount=0,ccount=0;    //Variables to count the vowels and consonants
            str=str.toLowerCase();    //Convert the string to lowercase
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                    vcount++;  //Increment each time vowel encounters
                else if(str.charAt(i) >= 'a' && str.charAt(i)<='z')
                    ccount++;   //Increment each time consonant encounters
            }
            //Print the total number of vowels
            System.out.println("The total number of vowels is: "+vcount);
            //Print the total number of consonants
            System.out.println("The total number of consonants is: "+ccount);
        }
    }


