package Day13;

import java.util.ArrayList;

public class GenericsDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Spring");

        for(String s : list) {
            System.out.println(s);
        }
    }
}
