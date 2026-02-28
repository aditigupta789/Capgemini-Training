package Day13;

/*
 Assignment 13
 Topic: Queue, ArrayList, Sorting, TreeSet, Generics

 Tasks:
 1. Store numbers in ArrayList and sort them
 2. Store tasks in Queue and remove one task
 3. Store unique numbers using TreeSet
*/

import java.util.*;

public class Assignment13 {

    public static void main(String[] args) {

        // ArrayList sorting
        ArrayList<Integer> list = new ArrayList<>();

        list.add(25);
        list.add(5);
        list.add(15);

        Collections.sort(list);

        System.out.println("Sorted list: " + list);


        // Queue
        Queue<String> queue = new LinkedList<>();

        queue.add("Task1");
        queue.add("Task2");

        queue.poll();

        System.out.println("Queue after removal: " + queue);


        // TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(5);
        set.add(10);

        System.out.println("Unique sorted values: " + set);
    }
}
