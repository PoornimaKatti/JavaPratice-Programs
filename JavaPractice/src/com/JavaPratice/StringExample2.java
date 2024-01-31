package com.JavaPratice;
//StringBuffer example
public class StringExample2 {

        public static void main(String[] args) {
            // Create a mutable StringBuffer
            StringBuffer mutableBuffer = new StringBuffer("Poornima is ");

            System.out.println("Original StringBuffer: " + mutableBuffer);

            // Append additional text (mutating the original buffer)
            mutableBuffer.append(" Girl");
            System.out.println("Appended StringBuffer: " + mutableBuffer);

            // Insert text at a specific position (mutating the original buffer)
            mutableBuffer.insert(11, " Beautiful");
            System.out.println("Inserted StringBuffer: " + mutableBuffer);

            // Reverse the content (mutating the original buffer)
            mutableBuffer.reverse();
            System.out.println("Reversed StringBuffer: " + mutableBuffer);
        }
    }


