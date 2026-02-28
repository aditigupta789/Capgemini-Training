package Day1;

/*
 Assignment 1 – Java Overview, JVM, Data Types, Variables, Literals

 Objective:
 1. Declare variables of different primitive data types
 2. Use literals to assign values
 3. Demonstrate instance and static variables
 4. Print JVM information
*/

public class Assignment1 {

    // static variable (common for all objects)
    static String company = "Capgemini";

    // instance variable
    int employeeId = 101;

    public static void main(String[] args) {

        // primitive data types with literals
        int age = 22;
        long phoneNumber = 9876543210L;
        float height = 5.4f;
        double percentage = 88.75;
        char grade = 'A';
        boolean isSelected = true;
        byte experience = 1;
        short year = 2026;

        // non-primitive data type
        String name = "Aditi";

        // printing values
        System.out.println("----- Employee Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Height: " + height);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Selected: " + isSelected);
        System.out.println("Experience (years): " + experience);
        System.out.println("Year: " + year);

        // accessing static variable
        System.out.println("Company: " + company);

        // accessing instance variable
        Assignment1 obj = new Assignment1();
        System.out.println("Employee ID: " + obj.employeeId);

        // JVM information
        System.out.println("\n----- JVM Details -----");
        System.out.println("JVM Name: " + System.getProperty("java.vm.name"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
    }
}
