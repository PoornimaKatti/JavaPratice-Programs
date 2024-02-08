package com.JavaPratice;


    abstract class Animal {
        abstract void sound();
    }

    class Dog extends Animal {
        void sound() {
            System.out.println("Woof!");
        }
    }

    public class AbstractionExample3  {
        public static void main(String[] args) {
            Animal dog = new Dog();
            dog.sound(); // Output: Woof!
        }
    }


