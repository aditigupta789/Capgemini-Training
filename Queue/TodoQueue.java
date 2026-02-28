package Queue;

import java.util.*;

public class TodoQueue {

    public static void main(String[] args) {

        Queue<String> tasks=new LinkedList<>();

        tasks.add("Study Java");
        tasks.add("Practice DSA");
        tasks.add("Complete assignment");

        while(!tasks.isEmpty()){

            System.out.println("Processing: "+tasks.poll());
        }
    }
}
