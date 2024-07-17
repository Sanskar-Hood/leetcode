
import java.util.*;

public class printcyclelength {

    public static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static class pair {
        int src;
        int time;
        pair(int src,int time){
            this.time=time;
            this.src=src;
        }
    
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int vtces = Integer.parseInt(sc.nextLine());
        int e = Integer.parseInt(sc.nextLine());

        ArrayList<Edge>[] graph = new ArrayList[vtces + 1]; //
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            String str = sc.nextLine(); //

            String[] arr = str.split(" ");
            int u = Integer.parseInt(arr[0]);
            int v = Integer.parseInt(arr[1]);
            int wt = Integer.parseInt(arr[2]);

            graph[u].add(new Edge(u, v, wt));
            graph[v].add(new Edge(v, u, wt));

        }
        int src = sc.nextInt();
        int dest = sc.nextInt();
        Integer[] vis = new Integer[vtces]; 
        Queue<pair> queue = new ArrayDeque<>();
        queue.add(new pair(src, 0));


        while(queue.size()>0){
            pair p =queue.remove();
            if(vis[p.src]!=null){
                System.out.println(vis[p.src]+p.time);
                break;
            }

            vis[p.src]=p.time;
            for(Edge t: graph[p.src] ){
                if(vis[t.nbr]==null){
                    queue.add(new pair(t.nbr, p.time+1));
                }
            }
        }
        

        
        
        
    

    // public static void cyclechecker(int src, ArrayList<Edge>[] graph , Integer[] vis ,Queue<pair> queue){
        
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