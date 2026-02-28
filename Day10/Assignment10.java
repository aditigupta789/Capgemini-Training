package Day10;

/*
 Assignment 10
 Topic: Access modifiers, static members, enums

 Task:
 1. Create Student class with private id and public name
 2. Use static variable college shared by all students
 3. Use enum for Course
*/

enum Course {
    JAVA,
    SQL,
    SPRING
}

class Student {

    private int id;
    public String name;

    static String college = "Galgotias University";

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display(Course course) {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println("Course: " + course);
    }
}

public class Assignment10 {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Aditi");

        s1.display(Course.JAVA);
    }
}
