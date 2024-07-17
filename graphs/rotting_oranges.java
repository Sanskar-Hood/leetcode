import java.util.*;

public class rotting_oranges {

    public static void main(String[] args) {
        int[][] graph = { { 2, 1, 1 }, { 0, 1, 1 }, { 1, 0, 1 } };
        System.out.println(orangesRotting(graph));
    }

    static int fresh = 0;

    public static int orangesRotting(int[][] graph) {
        Queue<pair> que = new ArrayDeque<>();
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                if (graph[i][j] == 1)
                    fresh++;
                if (graph[i][j] == 2)
                    que.add(new pair(i, j));
            }
        }
        int level = -1;
        while ((!que.isEmpty())) {
            level++;
            int s = que.size();
            while (s-- > 0) {
                pair p = que.remove();
                bfs(p.f + 1, p.s, graph, que);
                bfs(p.f - 1, p.s, graph, que);
                bfs(p.f, p.s + 1, graph, que);
                bfs(p.f, p.s - 1, graph, que);

            }
        }

        if (fresh == 0)
            return level;
        else
            return -1;
    }

    public static void bfs(int i, int j, int[][] graph, Queue<pair> que) {
        if (i < 0 || j < 0 || i == graph.length || j == graph[0].length || graph[i][j] != 1) {
            return;

        }
        graph[i][j] = 0;
        que.add(new pair(i, j));
        fresh--;
    }

    public static class pair {
        int f;
        int s;

        pair(int f, int s) {
            this.f = f;
            this.s = s;
        }

    }
}
