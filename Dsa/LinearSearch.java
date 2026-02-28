package Dsa;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr={5,9,2,7};

        int target=7;

        boolean found=false;

        for(int num:arr){

            if(num==target){
                found=true;
                break;
            }
        }

        System.out.println(found?"Found":"Not Found");
    }
}