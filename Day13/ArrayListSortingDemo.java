package Day13;

import java.util.*;

public class ArrayListSortingDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(50);
        list.add(10);
        list.add(30);

        System.out.println("Before sorting: " + list);

        Collections.sort(list);

        System.out.println("After sorting: " + list);
    }
}
