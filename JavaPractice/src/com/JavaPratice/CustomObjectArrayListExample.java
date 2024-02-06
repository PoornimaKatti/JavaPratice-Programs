package com.JavaPratice;

    import java.util.ArrayList;

class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

    public class CustomObjectArrayListExample {
        public static void main(String[] args) {
            ArrayList<Person1> persons = new ArrayList<>();
            persons.add(new Person1("Alice", 30));
            persons.add(new Person1("Bob", 25));
            persons.add(new Person1("Charlie", 35));

            System.out.println("Elements in Custom Object ArrayList:");
            for (Person1 person : persons) {
                System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
            }
        }
    }


