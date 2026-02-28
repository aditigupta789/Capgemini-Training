package Day9;

interface Payment {

    void pay();
}

class UPI implements Payment {

    public void pay() {
        System.out.println("Payment using UPI");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Payment p = new UPI();
        p.pay();
    }
}
