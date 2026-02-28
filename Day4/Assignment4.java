package Day4;

public class Assignment4 {

    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20, 25};

        int sum = 0;
        int max = arr[0];

        for (int num : arr) {
            sum += num;

            if (num > max)
                max = num;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Maximum = " + max);
    }
}
