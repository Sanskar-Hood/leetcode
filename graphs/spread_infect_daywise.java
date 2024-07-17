
// import graphs.*;
import java.text.ParsePosition;
import java.util.*;

public class spread_infect_daywise {

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

        pair(int src, int time) {
            this.src = src;
            this.time = time;
        }

    }

    public static int prev = 1;

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
        int ref = sc.nextInt();
        String ans = "";
        boolean[] vis = new boolean[vtces];
        Queue<pair> queue = new ArrayDeque<>();
        queue.add(new pair(src, 1));

        while (queue.size() > 0) {
            pair p = queue.remove();
            if (vis[p.src] == true)
                continue;
            vis[p.src] = true;
            if (p.time <= ref) {
                if (p.time != prev) {
                    if (prev != -1) System.out.println(); // Move to new line for new level
                    prev = p.time;
                }
    
            System.out.print(p.src);
            } else
                break;
            for (Edge t : graph[p.src]) {
                if (vis[t.nbr] == false) {
                    queue.add(new pair(t.nbr, p.time + 1));
                }
            }

        }
        System.out.println(ans);

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