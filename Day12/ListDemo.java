package Day12;

import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("SQL");
        list.add("Spring");

        System.out.println("List elements:");

        for(String item : list) {
            System.out.println(item);
        }

        System.out.println("Element at index 1: " + list.get(1));
    }
}
