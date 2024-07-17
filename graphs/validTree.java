import java.util.ArrayList;
// import java.util.List;

public class validTree {
    public static void main(String[] args) {
        int n=5;
        
        int [][]edges ={{0,1},{1,2},{2,3},{1,3},{1,4}};
        System.out.println(validTree1(n, edges));
    }
    public static boolean validTree1(int n, int[][] edges) {
        if(edges.length!=n-1) return false;
        ArrayList<ArrayList<Integer>> graph  = new ArrayList<>();
        for(int i=0 ;i < n ; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        count=1;
        dfs(0, graph, visited);
        if(count!=n) return false;
        for(boolean v : visited){
            if(v==false) return false;
        }
        return true;
    
}
    public static int  count;

    public static void dfs(int i ,ArrayList<ArrayList<Integer>> graph ,boolean[] visited ){
        visited[i]=true;
        for(int nbr : graph.get(i)){
            if(visited[nbr]==false){
                count++;
                dfs(nbr, graph, visited);
            }
        }
    }
}