package Day12;

import java.util.HashSet;

public class SetDemo {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println("Set elements:");

        for(int num : set) {
            System.out.println(num);
        }
    }
}
