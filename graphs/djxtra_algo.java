// import graphs.*;
import java.util.*;
public class djxtra_algo {

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
        PriorityQueue<triplet> queue = new PriorityQueue<>();
        queue.add(new triplet(src,src+"",0));
        boolean[]vis = new boolean[vtces];
        // ArrayList<Integer> list =new ArrayList<>();

        while ((queue.size()>0)) {
            triplet rem = queue.remove();
            if(vis[rem.src]==true) continue;

            vis[rem.src]=true;
            if(rem.src==dest){
                System.out.println(rem.wsf + " " + rem.psf);
            }
            
            for(Edge t : graph[rem.src]){
                if(vis[t.nbr]==false){
                    queue.add(new triplet(t.nbr,rem.psf+t.nbr,t.wt+rem.wsf));
                }
            }
            
        }
        

  
  
    }
    public static class triplet implements Comparable<triplet>{
        int src;
        String psf;
        int wsf;

        triplet(int src,String psf,int wsf){
            this.src=src;
            this.psf=psf;
            this.wsf=wsf;
        }
        public int compareTo(triplet o){
            return this.wsf-o.wsf;
        }

    }
}


  



// 7 input 
// 8
// 0 1 10 
// 0 3 40 
// 1 2 10 
// 2 3 10
// 3 4 5
// 4 6 8
// 5 6 6
// 4 5 3
// 0
// 6
// 43 012346