package Day6;

public class Student {

    int id;
    String name;

    // constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // method overloading
    void display() {
        System.out.println(id + " " + name);
    }

    void display(String course) {
        System.out.println(name + " enrolled in " + course);
    }

    public static void main(String[] args) {

        Student s1 = new Student(101, "Aditi");

        s1.display();
        s1.display("Java");
    }
}
