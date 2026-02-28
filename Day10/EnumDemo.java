package Day10;

enum Status {
    ACTIVE,
    INACTIVE,
    PENDING
}

public class EnumDemo {

    public static void main(String[] args) {

        Status s = Status.ACTIVE;

        System.out.println("Status: " + s);
    }
}
