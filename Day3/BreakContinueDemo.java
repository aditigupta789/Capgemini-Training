package Day3;

public class BreakContinueDemo {

    public static void main(String[] args) {

        // break example
        System.out.println("Break example:");
        for (int i = 1; i <= 10; i++) {

            if (i == 6) {
                break; // stops loop
            }

            System.out.println(i);
        }


        // continue example
        System.out.println("\nContinue example:");
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue; // skips 5
            }

            System.out.println(i);
        }
    }
}
