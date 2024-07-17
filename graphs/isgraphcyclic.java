
// import graphs.*;
import java.util.*;

public class isgraphcyclic {

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
        boolean[]vis=new boolean[vtces];
        for(int i=0;i<vtces;i++){       //checking all vertices as source 
            if(vis[i]==false){          
                boolean flag =bfs(graph, i, vis);
                if(flag==true){
                    System.out.println("true");
                    break;              // if any part of graph found cyclic no need to check others 
                }
            }
        }
            
    }



    public static boolean bfs(ArrayList<Edge>[] graph, int src, boolean[] vis) {
        Queue<P> queue = new ArrayDeque<>();        //que creation  
        queue.add(new P(src, src + ""));        //adding 1st souce manually

        ArrayList<Integer> list = new ArrayList<>();

        while ((queue.size() > 0)) {
            P rem = queue.remove();     //r
            if (vis[rem.src] == true)   //m*
                return true;

            vis[rem.src] = true;        //m 
            list.add(rem.src);             //w
            for (Edge t : graph[rem.src]) {
                if (vis[t.nbr] == false) {
                    queue.add(new P(t.nbr, rem.psf));   //a*
                }
            }

        }
        return false;       //returning fasle if none found

        
    }

    public static class P {
        int src;
        String psf;

        P(int src, String psf) {
            this.src = src;
            this.psf = psf;
        }

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
//_____________________________________________________________________________________
//without using class P
// boolean[] vis =new boolean[vtces];
// for(int i = 0 ;i <vtces ;i++){
//     boolean flag=iscyclic(i, graph,vis);
//     if(flag==true) {
//         System.err.println("true");
//         break;
//     }

// }


// }


// public static boolean iscyclic(int src, ArrayList<Edge>[] graph , boolean[] vis){
// Queue<Integer> queue = new ArrayDeque<>();
// queue.add(src);
// while(queue.size()>0){
//     int i =queue.remove();
//     if(vis[i]==true){
//         return true;
        
        
//     }
//     vis[i]=true;
//     for(Edge t: graph[i]){
//         if(vis[t.nbr]==false){
//             queue.add(t.nbr);
//         }
//     }

    
// }
// return false;
// }
// }   
//__________________________________________________________________________________________