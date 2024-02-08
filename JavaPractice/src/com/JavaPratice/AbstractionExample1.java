package com.JavaPratice;


    abstract class Shape1 {
        abstract void draw();
    }

    class Circle1 extends Shape1 {
        void draw() {
            System.out.println("Drawing Circle");
        }
    }

    class Rectangle1 extends Shape1 {
        void draw() {
            System.out.println("Drawing Rectangle");
        }
    }

    public class AbstractionExample1{
        public static void main(String[] args) {
            Shape1 circle1 = new Circle1();
            Shape1 rectangle1 = new Rectangle1();
            circle1.draw();    // Output: Drawing Circle
            rectangle1.draw(); // Output: Drawing Rectangle
        }
    }



