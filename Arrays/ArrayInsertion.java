package Arrays;

import java.util.Arrays;

public class ArrayInsertion {

    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;

        int position=1;
        int value=15;

        for(int i=3;i>position;i--){
            arr[i]=arr[i-1];
        }

        arr[position]=value;

        System.out.println(Arrays.toString(arr));
    }
}
