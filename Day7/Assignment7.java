package Day7;

/*
 Assignment 7
 Topic: Encapsulation and Abstraction

 Task:
 1. Create a class BankAccount with private balance.
 2. Provide setter and getter methods.
 3. Create an abstract class Shape with abstract method area().
 4. Create Circle class and implement area().
*/

class BankAccount {

    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}


abstract class Shape {

    abstract void area();
}


class Circle extends Shape {

    double radius = 5;

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}


public class Assignment7 {

    public static void main(String[] args) {

        // Encapsulation example
        BankAccount account = new BankAccount();

        account.setBalance(10000);

        System.out.println("Balance = " + account.getBalance());


        // Abstraction example
        Shape shape = new Circle();
        shape.area();
    }
}
