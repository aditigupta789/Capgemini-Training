package Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr={1,1,2,2,3,4};

        System.out.println("Unique elements:");

        for(int i=0;i<arr.length;i++){

            if(i==0 || arr[i]!=arr[i-1]){
                System.out.println(arr[i]);
            }
        }
    }
}
