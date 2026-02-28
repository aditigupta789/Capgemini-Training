package Day13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");

        System.out.println("Queue: " + queue);

        System.out.println("Removed: " + queue.poll());

        System.out.println("Front: " + queue.peek());
    }
}
