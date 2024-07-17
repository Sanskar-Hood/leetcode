// import graphs.*;
import java.nio.file.Path;
import java.util.*;
public class printallpath {

    public static class Edge{
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    public static void main(String[] args) {
        // static Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int vtces = Integer.parseInt(sc.nextLine());        
        int e = Integer.parseInt(sc.nextLine());        

        // ArrayList<Integer> al = new ArrayList<>();
        //
        ArrayList<Edge>[] graph = new ArrayList[vtces+1];   //
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }


        for(int i = 0; i < e; i++){
            String str = sc.nextLine();                     //

            String[] arr = str.split(" ");
            int u = Integer.parseInt(arr[0]);     // "67", "abc", ""
            int v = Integer.parseInt(arr[1]);
            int wt = Integer.parseInt(arr[2]);

            graph[u].add(new Edge(u, v, wt));
            graph[v].add(new Edge(v, u, wt));
        }


        int src = sc.nextInt();
        int dest = sc.nextInt();
        boolean[]vis = new boolean[vtces];
        ArrayList<Integer> path = new ArrayList<>();
        
        // Start finding all paths
        paths(src, dest, vis, path, graph);
        

        


    }
    
    
    public static void paths(int src, int dest , boolean [] vis , ArrayList<Integer> p,ArrayList<Edge>[] graph){
        if(src==dest){
            p.add(src);
            System.out.println(p);
            p.remove(p.size()-1);
            return ;
        }

        vis[src]=true;
        p.add(src);
        ArrayList<Edge> curr = graph[src];

        for(int i =0 ;i< curr.size() ;i ++){
            Edge e = curr.get(i);

            if(vis[e.nbr]==false){
                
                paths(e.nbr, dest, vis, p, graph);
            }

            
        }
        p.remove(p.size() - 1);
        vis[src] = false;

    }
    
        
        
    
}
