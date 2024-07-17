// import graphs.*;
import java.util.*;
public class level_order {

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
        Queue<P> queue = new ArrayDeque<>();
        queue.add(new P(src,src+""));
        boolean[]vis = new boolean[vtces];
        ArrayList<Integer> list =new ArrayList<>();

        while ((queue.size()>0)) {
            P rem = queue.remove();
            if(vis[rem.src]==true) continue;

            vis[rem.src]=true;
            list.add(rem.src);
            for(Edge t : graph[rem.src]){
                if(vis[t.nbr]==false){
                    queue.add(new P(t.nbr,rem.psf));
                }
            }
            
        }
        System.out.println(list);

  
  
    }
    
    public static class P{
        int src;
        String psf;

        P(int src,String psf){
            this.src=src;
            this.psf=psf;
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

// levelorder without psf
// -----------------------------------------
// int src = sc.nextInt();
//         int dest = sc.nextInt();
//         String s="";
//         boolean[] vis = new boolean[vtces];
//         Queue<Integer> queue = new ArrayDeque<>();
//         queue.add(src);


//         while(queue.size()>0){
//             int p= queue.remove();
//             if(vis[p]==true) continue;
//             vis[p]=true;
//             s+=p;
//             for(Edge t :graph[p]){
//                 if(vis[t.nbr]==false){
//                     queue.add(t.nbr);
//                 }
//             }
            
//         }
//         System.out.println(s);
// --------------------------------------------------------        