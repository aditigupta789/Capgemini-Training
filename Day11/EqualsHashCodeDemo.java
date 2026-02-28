package Day11;

public class EqualsHashCodeDemo {

    public static void main(String[] args) {

        Integer a = 200;
        Integer b = 200;

        System.out.println("equals(): " + a.equals(b));

        System.out.println("hashCode of a: " + a.hashCode());
        System.out.println("hashCode of b: " + b.hashCode());
    }
}