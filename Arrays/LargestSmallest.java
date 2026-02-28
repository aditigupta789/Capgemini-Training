package Arrays;

public class LargestSmallest {

    public static void main(String[] args) {

        int[] arr={5,2,9,1,7};

        int max=arr[0];
        int min=arr[0];

        for(int num:arr){

            if(num>max)
                max=num;

            if(num<min)
                min=num;
        }

        System.out.println("Largest: "+max);
        System.out.println("Smallest: "+min);
    }
}
