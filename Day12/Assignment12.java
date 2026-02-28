package Day12;

/*
 Assignment 12
 Topic: Collections, List, Set, Map

 Task:
 1. Store 5 student names using ArrayList
 2. Store 5 numbers using HashSet
 3. Store student id and name using HashMap
*/

import java.util.*;

public class Assignment12 {

    public static void main(String[] args) {

        // List
        ArrayList<String> students = new ArrayList<>();

        students.add("Aditi");
        students.add("Neha");
        students.add("Riya");

        System.out.println("Student List:");
        System.out.println(students);


        // Set
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);

        System.out.println("Unique Numbers:");
        System.out.println(numbers);


        // Map
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Java");
        map.put(2,"SQL");

        System.out.println("Map data:");

        for(Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
