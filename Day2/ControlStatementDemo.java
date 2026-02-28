package Day2;

public class ControlStatementDemo {

    public static void main(String[] args) {

        int marks = 72;

        // if-else
        if (marks >= 50) {
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }


        // else-if ladder
        if (marks >= 90)
            System.out.println("Grade A");
        else if (marks >= 70)
            System.out.println("Grade B");
        else if (marks >= 50)
            System.out.println("Grade C");
        else
            System.out.println("Grade D");


        // switch statement
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid");
        }


        // for loop
        System.out.println("\nFor loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // while loop
        System.out.println("\nWhile loop:");
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }
    }
}
