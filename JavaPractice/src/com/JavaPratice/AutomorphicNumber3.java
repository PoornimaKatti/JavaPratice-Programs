package com.JavaPratice;

import java.util.Scanner;

    public class AutomorphicNumber3 {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);

            int l, h;

            System.out.println("Input lower interval value");
            l = in.nextInt();
            System.out.println("Input upper interval value");
            h = in.nextInt();

            System.out.println("Automorphic numbers between "+l+" and "+h);
            for(int i=l; i<=h; i++){
                if(checkAutomorphic(i))
                    System.out.print(i+" ");
            }
        }

        private static boolean checkAutomorphic(int num) {
            int c=0, sqr = num*num;
            int temp =num;  //copying num

            //countint digits of num
            while(temp>0){
                c++;
                temp=temp/10;
            }

            int lastSquareDigits = (int) (sqr%(Math.pow(10,c)));

            return num == lastSquareDigits;
        }
    }

