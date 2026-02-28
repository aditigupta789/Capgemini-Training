package Day2;

/*
 Assignment 2
 Topic: Operators, Assignment Operators, Control Statements

 Problem:
 1. Take two numbers and perform all arithmetic operations.
 2. Check which number is greater.
 3. Check if number is even or odd.
 4. Print numbers from 1 to 10 using loop.
*/

public class Assignment2 {

    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 7;

        // arithmetic operations
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));


        // relational operator
        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else {
            System.out.println(num2 + " is greater");
        }


        // even or odd check
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is Even");
        } else {
            System.out.println(num1 + " is Odd");
        }


        // loop example
        System.out.println("Numbers from 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
