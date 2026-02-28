package Day11;

public class WrapperDemo {

    public static void main(String[] args) {

        int num = 10;

        // manual conversion
        Integer obj1 = Integer.valueOf(num);

        // autoboxing
        Integer obj2 = num;

        // unboxing
        int value = obj2;

        System.out.println("Primitive: " + num);
        System.out.println("Wrapper object: " + obj1);
        System.out.println("Unboxed value: " + value);
    }
}
