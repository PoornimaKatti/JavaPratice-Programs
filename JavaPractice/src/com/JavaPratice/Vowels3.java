package com.JavaPratice;

import java.util.Scanner;

public class Vowels3 {

        public static void main(String[] args)
        {
            String str;
            char ch;
            int len, i, vowel=0, consonant=0;
            Scanner s = new Scanner(System.in);

            System.out.print("Enter the String: ");
            str = s.nextLine();

            len = str.length();
            for(i=0; i<len; i++)
            {
                ch = str.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    vowel++;
                else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                    vowel++;
                else
                {
                    int ascii = ch;
                    if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122))
                        consonant++;
                }
            }
            System.out.println("\nTotal Vowels = " +vowel);
            System.out.println("Total Consonants = " +consonant);
        }
    }

