
// import graphs.*;
import java.util.*;

public class connection {

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
        ArrayList<Edge>[] graph = new ArrayList[vtces + 1]; //
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            String str = sc.nextLine(); //

            String[] arr = str.split(" ");
            int u = Integer.parseInt(arr[0]); // "67", "abc", ""
            int v = Integer.parseInt(arr[1]);
            int wt = Integer.parseInt(arr[2]);

            graph[u].add(new Edge(u, v, wt));
            graph[v].add(new Edge(v, u, wt));
        }

        int src = sc.nextInt();
        int dest = sc.nextInt();
        boolean[] vis = new boolean[vtces];

        vis = new boolean[vtces];

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < vtces; i++) {

            if (vis[i] == false) {
                ArrayList<Integer> curr = new ArrayList<>();
                getconnected(i, graph, vis, curr);
                ans.add(curr);
            }
        }
        System.out.println(ans);

    }

    public static void getconnected(int src, ArrayList<Edge>[] graph, boolean[] vis, ArrayList<Integer> curr) {

        vis[src] = true;
        curr.add(src);

        for (Edge e : graph[src]) {

            if (vis[e.nbr] == false) {
                getconnected(e.nbr, graph, vis, curr);
            }

        }

        //
        return;
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