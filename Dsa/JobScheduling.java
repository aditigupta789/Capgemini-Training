package Dsa;

import java.util.Arrays;

class Job implements Comparable<Job>{

    int deadline,profit;

    Job(int d,int p){

        deadline=d;
        profit=p;
    }

    public int compareTo(Job j){
        return j.profit-this.profit;
    }
}

public class JobScheduling {

    public static void main(String[] args) {

        Job[] jobs={
                new Job(2,100),
                new Job(1,50),
                new Job(2,10)
        };

        Arrays.sort(jobs);

        int total=0;

        for(Job j:jobs){

            total+=j.profit;
        }

        System.out.println("Max profit: "+total);
    }
}
