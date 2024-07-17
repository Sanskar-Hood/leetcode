import java.util.*;
/**
 * test
 */
public class islands_and_treasures {

    public static void main(String[] args) {
         
        int rows=4;
        int cols=4;
        int[][] graph ={
            {2147483647,-1,0,2147483647},
            {2147483647,2147483647,2147483647,-1},
            {2147483647,-1,2147483647,-1},
            {0,-1,2147483647,2147483647}
        };
        boolean[][] visited = new boolean[rows][cols];
        Queue<pair> que =new ArrayDeque<>();
        for(int i=0;i<rows ; i++){
            for(int j=0 ; j<cols ;j++){
                if(graph[i][j]==0){
                    que.add(new pair(i,j));
                    visited[i][j]=true;
                }
            }
        }
        int dist=0;
        while(que.size()>0){
            int s =que.size();
            for(int i=0 ;i< s ;i++){
                pair r =que.remove();
                graph[r.f][r.s]=dist;
                bfs(r.f-1, r.s, que, visited, graph);
                bfs(r.f+1, r.s, que, visited, graph);
                bfs(r.f, r.s-1, que, visited, graph);
                bfs(r.f, r.s+1, que, visited, graph);

            }
            dist++;
        }
        for(int i=0;i<rows ; i++){
            System.out.println();
            for(int j=0 ; j<cols ;j++){
                System.out.print(graph[i][j]+"  ");
            }
        }

    }

    public static void bfs(int i, int j ,Queue<pair> que , boolean[][]visited , int[][]graph){
        if(i<0 || i ==graph.length || j<0 || j==graph[0].length || visited[i][j]==true || graph[i][j]==-1){
            return;
        }
        visited[i][j]=true;
        que.add(new pair(i,j));
    }

    public static class pair{
        int f;
        int s;
        pair(int f ,int s){
            this.f=f;
            this.s=s;
        }
    }

    
}