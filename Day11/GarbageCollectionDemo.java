package Day11;

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    protected void finalize() {
        System.out.println(name + " object destroyed");
    }
}

public class GarbageCollectionDemo {

    public static void main(String[] args) {

        Student s1 = new Student("Test");

        s1 = null;

        System.gc();

        System.out.println("Garbage collection requested");
    }
}
