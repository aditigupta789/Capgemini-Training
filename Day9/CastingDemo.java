package Day9;

class Parent {}
class Child extends Parent {}

public class CastingDemo {

    public static void main(String[] args) {

        Parent p = new Child(); // upcasting

        Child c = (Child) p; // downcasting

        System.out.println("Casting successful");
    }
}
