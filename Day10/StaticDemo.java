package Day10;

class Company {

    static String companyName = "Capgemini";

    static void showCompany() {
        System.out.println("Company: " + companyName);
    }
}

public class StaticDemo {

    public static void main(String[] args) {

        Company.showCompany();
    }
}