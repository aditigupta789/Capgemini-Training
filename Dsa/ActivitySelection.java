package Dsa;

import java.util.Arrays;

class Activity implements Comparable<Activity>{

    int start,finish;

    Activity(int s,int f){
        start=s;
        finish=f;
    }

    public int compareTo(Activity a){
        return this.finish-a.finish;
    }
}

public class ActivitySelection {

    public static void main(String[] args) {

        Activity[] arr={
                new Activity(1,3),
                new Activity(2,5),
                new Activity(4,7),
                new Activity(6,9)
        };

        Arrays.sort(arr);

        int count=1;
        int last=arr[0].finish;

        for(int i=1;i<arr.length;i++){

            if(arr[i].start>=last){

                count++;
                last=arr[i].finish;
            }
        }

        System.out.println("Max activities: "+count);
    }
}
