package Day5;

public class Assignment5 {

    public static void main(String[] args) {

        String str = "Java";

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
