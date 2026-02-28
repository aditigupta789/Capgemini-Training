package Dsa;

import java.util.HashSet;

public class FirstDuplicate {

    public static void main(String[] args) {

        int[] arr={3,1,4,2,5,3};

        HashSet<Integer> set=new HashSet<>();

        for(int num:arr){

            if(set.contains(num)){

                System.out.println("Duplicate: "+num);
                break;
            }

            set.add(num);
        }
    }
}
