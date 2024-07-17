// import graphs.*;
import java.util.*;
public class topological_sort {

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
            // graph[v].add(new Edge(v, u, wt));
        }


        int src = sc.nextInt();
        int dest = sc.nextInt();
        boolean[]vis = new boolean[vtces];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<vtces ; i++){
            if(vis[i]==false){
                toposort(vis, stack, graph, i);
            }
        }
        int[] ans = new int[vtces];
        int i=0;
        while (!stack.isEmpty()) {
            ans[i++]=stack.pop();
            
        }

        for(int p=0 ;p <vtces ; p++){
            System.out.println(ans[p]);
        }

       
  
  
    }
  
    public static void toposort(boolean[] vis , Stack<Integer> stack ,ArrayList<Edge>[] graph , int vtces){
        vis[vtces]=true;
        for(Edge e : graph[vtces]){
            if(vis[e.nbr]==false){
                toposort(vis, stack, graph, e.nbr);
            }
        }
        stack.push(vtces);
    }
}


// input
// 7
// 8
// 0 1 10
// 1 2 10
// 4 5 5
// 0 3 40 
// 2 3 10
// 3 4 8
// 5 6 3
// 4 6 3
// 0
// 6