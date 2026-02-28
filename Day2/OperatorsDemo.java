package Day2;

public class OperatorsDemo {

    public static void main(String[] args) {

        int a = 20;
        int b = 5;

        // Arithmetic operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));


        // Relational operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));


        // Logical operators
        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("\nLogical Operators:");
        System.out.println("condition1 && condition2 : " + (condition1 && condition2));
        System.out.println("condition1 || condition2 : " + (condition1 || condition2));
        System.out.println("!condition1 : " + (!condition1));


        // Assignment operators
        int x = 10;
        x += 5;
        System.out.println("\nAssignment Operator += : " + x);

        x *= 2;
        System.out.println("Assignment Operator *= : " + x);
    }
}
