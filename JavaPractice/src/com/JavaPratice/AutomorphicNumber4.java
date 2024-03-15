package com.JavaPratice;



    public class AutomorphicNumber4 {
        //method to check if a number is automorphic
        static boolean checkAutomorphic(int num)
        {
            int square = num * num;
            while (num > 0)
            {
                if (num % 10 != square % 10)
                    return false;
                num = num/10;
                square = square/10;
            }
            return true;
        }
        public static void main(String args[])
        {
            System.out.println("Is 25 automorphic? : "+checkAutomorphic(25));
            System.out.println("Is 7 automorphic? : "+checkAutomorphic(7));
        }
    }


