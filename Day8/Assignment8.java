package Day8;

/*
 Assignment 8
 Topic: Inheritance, HAS-A, Polymorphism

 Task:
 1. Create class Person and subclass Employee.
 2. Demonstrate method overriding.
 3. Demonstrate HAS-A relationship.
*/

class Person {

    void display() {
        System.out.println("This is a person");
    }
}


class Employee extends Person {

    void display() {
        System.out.println("This is an employee");
    }
}


// HAS-A example
class Address {

    String city = "Pune";
}


class Company {

    Address address = new Address();

    void showAddress() {
        System.out.println("Company located in " + address.city);
    }
}


public class Assignment8 {

    public static void main(String[] args) {

        // polymorphism
        Person p = new Employee();
        p.display();

        // HAS-A
        Company company = new Company();
        company.showAddress();
    }
}