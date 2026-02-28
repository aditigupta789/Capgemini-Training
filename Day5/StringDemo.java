package Day5;

public class StringDemo {

    public static void main(String[] args) {

        String name = "Capgemini";

        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Substring: " + name.substring(0, 4));


        // StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Training");
        System.out.println("StringBuilder: " + sb);


        // StringBuffer
        StringBuffer sbf = new StringBuffer("Backend");
        sbf.append(" Development");
        System.out.println("StringBuffer: " + sbf);
    }
}
