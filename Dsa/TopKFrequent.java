package Dsa;

import java.util.*;

public class TopKFrequent {

    public static void main(String[] args) {

        int[] arr={1,1,1,2,2,3};

        int k=2;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:arr)
            map.put(num,map.getOrDefault(num,0)+1);

        PriorityQueue<Integer> pq=
                new PriorityQueue<>(
                        (a,b)->map.get(a)-map.get(b));

        for(int key:map.keySet()){

            pq.add(key);

            if(pq.size()>k)
                pq.poll();
        }

        System.out.println(pq);
    }
}
