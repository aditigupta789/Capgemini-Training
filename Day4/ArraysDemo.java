package Day4;

public class ArraysDemo {

    public static void main(String[] args) {

        // 1D array initialization
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("1D Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        // 2D array initialization
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\n2D Array elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        // passing array to method
        printArray(numbers);
    }

    static void printArray(int[] arr) {
        System.out.println("\nPrinting array using method:");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}