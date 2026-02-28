package Day9;

/*
 Assignment 9
 Topic: Interfaces, Method Overriding, Casting

 Task:
 1. Create interface Animal with method sound().
 2. Implement Dog class.
 3. Demonstrate upcasting and downcasting.
*/

interface Animal {

    void sound();
}


class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }

    void run() {
        System.out.println("Dog runs");
    }
}


public class Assignment9 {

    public static void main(String[] args) {

        // upcasting
        Animal animal = new Dog();
        animal.sound();


        // downcasting
        Dog dog = (Dog) animal;
        dog.run();
    }
}
