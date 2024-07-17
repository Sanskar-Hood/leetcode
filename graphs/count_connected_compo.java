    import java.util.ArrayList;
    import java.util.List;


    public class count_connected_compo {

        public static void main(String[] args) {
            int n=6;
            int [][] edges = {{0,1},{1,2},{2,3},{4,5}};
            System.out.println(countComponents(n, edges));
        }
        public static  int countComponents(int n, int[][] edges) {
            List<List<Integer>> graph =new ArrayList<>();
            for(int i=0 ;i < n;i++){
                graph.add(new ArrayList<>());
            }

            for(int i=0 ;i <edges.length ;i ++){
                graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
            }
            boolean[] visited = new boolean[n];
            int count=0;
            for(int i=0 ; i< n ; i++){
                if(visited[i]==false){
                    counted(i , graph, visited  );
                    count++;
                }
            }
            return count;
        }

        public static void counted(int n , List<List<Integer>> graph , boolean[] visited){
            visited[n]=true;
            for(int edge : graph.get(n) ){
                if(visited[edge]==false)
                {counted(edge, graph, visited);}
            }
            
        }
        
    }
