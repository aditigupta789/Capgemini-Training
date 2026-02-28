package Dsa;

public class PrimsAlgorithm {

    public static void main(String[] args) {

        int[][] graph={
                {0,2,0,6,0},
                {2,0,3,8,5},
                {0,3,0,0,7},
                {6,8,0,0,9},
                {0,5,7,9,0}
        };

        int n=graph.length;

        boolean[] visited=new boolean[n];

        visited[0]=true;

        int edges=0;

        while(edges<n-1){

            int min=999,x=0,y=0;

            for(int i=0;i<n;i++){

                if(visited[i]){

                    for(int j=0;j<n;j++){

                        if(!visited[j] && graph[i][j]!=0 && graph[i][j]<min){

                            min=graph[i][j];
                            x=i;
                            y=j;
                        }
                    }
                }
            }

            System.out.println(x+"-"+y+" weight:"+min);

            visited[y]=true;

            edges++;
        }
    }
}