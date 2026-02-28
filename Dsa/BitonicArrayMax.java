package Dsa;

public class BitonicArrayMax {

    public static void main(String[] args) {

        int[] arr={1,3,8,12,4,2};

        int max=arr[0];

        for(int num:arr){

            if(num>max)
                max=num;
        }

        System.out.println("Maximum: "+max);
    }
}