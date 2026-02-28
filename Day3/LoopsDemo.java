package Day3;

public class LoopsDemo {

    public static void main(String[] args) {

        // for loop
        System.out.println("For loop example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Value: " + i);
        }


        // while loop
        System.out.println("\nWhile loop example:");
        int i = 1;
        while (i <= 5) {
            System.out.println("Value: " + i);
            i++;
        }


        // do-while loop
        System.out.println("\nDo-while loop example:");
        int j = 1;
        do {
            System.out.println("Value: " + j);
            j++;
        } while (j <= 5);
    }
}
