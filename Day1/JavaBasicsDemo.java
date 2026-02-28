package Day1;

public class JavaBasicsDemo {

    // instance variable
    int instanceVariable = 50;

    // static variable
    static int staticVariable = 100;

    public static void main(String[] args) {

        // Local variables and literals
        int age = 21;                // integer literal
        double salary = 45000.75;   // double literal
        float temperature = 36.6f;  // float literal (f required)
        char grade = 'A';           // character literal
        boolean isJavaFun = true;   // boolean literal
        long population = 1400000000L; // long literal (L required)
        byte smallNumber = 10;
        short shortNumber = 2000;

        // Non-primitive data type (String)
        String name = "Aditi";

        // Print values
        System.out.println("=== Java Basics Demo ===");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Temperature: " + temperature);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun: " + isJavaFun);
        System.out.println("Population: " + population);
        System.out.println("Byte value: " + smallNumber);
        System.out.println("Short value: " + shortNumber);

        // Access static variable
        System.out.println("Static Variable: " + staticVariable);

        // Access instance variable using object
        JavaBasicsDemo obj = new JavaBasicsDemo();
        System.out.println("Instance Variable: " + obj.instanceVariable);

        // JVM info (to show JVM is running this program)
        System.out.println("\n=== JVM Information ===");
        System.out.println("JVM Name: " + System.getProperty("java.vm.name"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Operating System: " + System.getProperty("os.name"));

    }
}
