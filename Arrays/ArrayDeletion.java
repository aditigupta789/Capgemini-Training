package Arrays;

import java.util.Arrays;

public class ArrayDeletion {

    public static void main(String[] args) {

        int[] arr={10,20,30,40};

        int position=1;

        for(int i=position;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }

        arr[arr.length-1]=0;

        System.out.println(Arrays.toString(arr));
    }
}
