package Day3;

/*
 Assignment 3
 Topic: Loops, break, continue, problem solving

 Tasks:
 1. Print numbers from 1 to 10
 2. Print even numbers between 1 to 20
 3. Find sum of numbers from 1 to 10
 4. Stop loop when number becomes 7 (break)
 5. Skip number 3 (continue)
*/

public class Assignment3 {

    public static void main(String[] args) {

        // 1. Print 1 to 10
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        // 2. Even numbers
        System.out.println("\nEven numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0)
                System.out.println(i);
        }


        // 3. Sum of numbers
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }

        System.out.println("\nSum = " + sum);


        // 4. Break example
        System.out.println("\nBreak when number is 7:");

        for (int i = 1; i <= 10; i++) {

            if (i == 7)
                break;

            System.out.println(i);
        }


        // 5. Continue example
        System.out.println("\nSkip number 3:");

        for (int i = 1; i <= 5; i++) {

            if (i == 3)
                continue;

            System.out.println(i);
        }
    }
}
