package Day11;

/*
 Assignment 11
 Topic: Wrapper classes, autoboxing, garbage collection, equals(), hashCode()

 Task:
 1. Convert primitive int to Integer object
 2. Compare two Integer objects using equals()
 3. Print hashCode
*/

public class Assignment11 {

    public static void main(String[] args) {

        int num1 = 50;
        int num2 = 50;

        // autoboxing
        Integer obj1 = num1;
        Integer obj2 = num2;

        System.out.println("Object1: " + obj1);
        System.out.println("Object2: " + obj2);

        // equals
        if(obj1.equals(obj2)) {
            System.out.println("Values are equal");
        }

        // hashCode
        System.out.println("HashCode obj1: " + obj1.hashCode());
        System.out.println("HashCode obj2: " + obj2.hashCode());

        // garbage collection example
        obj1 = null;

        System.gc();

        System.out.println("Garbage collector called");
    }
}
