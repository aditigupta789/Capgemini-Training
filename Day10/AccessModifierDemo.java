package Day10;

class Employee {

    private int id = 101;   // private variable
    public String name = "Aditi"; // public variable

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class AccessModifierDemo {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.display();
    }
}
