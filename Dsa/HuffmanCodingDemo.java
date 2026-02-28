package Dsa;

import java.util.PriorityQueue;

class Node implements Comparable<Node>{

    int freq;

    Node(int f){
        freq=f;
    }

    public int compareTo(Node n){
        return this.freq-n.freq;
    }
}

public class HuffmanCodingDemo {

    public static void main(String[] args) {

        PriorityQueue<Node> pq=new PriorityQueue<>();

        pq.add(new Node(5));
        pq.add(new Node(9));
        pq.add(new Node(12));

        while(pq.size()>1){

            Node a=pq.poll();
            Node b=pq.poll();

            pq.add(new Node(a.freq+b.freq));
        }

        System.out.println("Huffman tree built");
    }
}
