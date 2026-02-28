package Day13;

import java.util.*;

public class TreeSetTreeMapDemo {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(40);
        set.add(10);
        set.add(30);

        System.out.println("TreeSet: " + set);


        TreeMap<Integer,String> map = new TreeMap<>();

        map.put(3,"Java");
        map.put(1,"SQL");
        map.put(2,"Spring");

        System.out.println("TreeMap: " + map);
    }
}
