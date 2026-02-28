package Dsa;

public class Knapsack {

    public static void main(String[] args) {

        int[] weight={1,3,4};
        int[] value={15,20,30};

        int capacity=4;

        int n=weight.length;

        int[][] dp=new int[n+1][capacity+1];

        for(int i=1;i<=n;i++){

            for(int w=1;w<=capacity;w++){

                if(weight[i-1]<=w){

                    dp[i][w]=Math.max(
                            value[i-1]+dp[i-1][w-weight[i-1]],
                            dp[i-1][w]);
                }
                else
                    dp[i][w]=dp[i-1][w];
            }
        }

        System.out.println(dp[n][capacity]);
    }
}
