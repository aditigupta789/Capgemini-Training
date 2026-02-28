package Day12;

import java.util.HashMap;

public class MapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(101,"Java");
        map.put(102,"SQL");
        map.put(103,"Spring");

        System.out.println("Map elements:");

        for(Integer key : map.keySet()) {

            System.out.println(key + " : " + map.get(key));
        }
    }
}
