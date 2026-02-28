package Dsa;

public class SquareRootBinarySearch {

    public static void main(String[] args) {

        int num=25;

        int left=1,right=num;

        while(left<=right){

            int mid=(left+right)/2;

            if(mid*mid==num){

                System.out.println("Square root: "+mid);
                break;
            }

            if(mid*mid<num)
                left=mid+1;
            else
                right=mid-1;
        }
    }
}