package Dsa;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(10);
        pq.add(5);
        pq.add(20);

        System.out.println("Min element: "+pq.peek());

        pq.poll();

        System.out.println(pq);
    }
}
