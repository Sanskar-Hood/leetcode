import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class course_scheduler {

    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = { { 1, 0 } ,{0,1}};
        System.out.println(canFinish(numCourses, prerequisites));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());

        }

        for (int i = 0; i < prerequisites.length; i++) {
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);

        }

        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                if (cycle(i, adj, visited))
                    return false;
            }
        }
        return true;

    }

                                    public static boolean cycle(int i, List<List<Integer>> adj, int[] visited) {
                                        if (visited[i] == 2) {
                                            return true;
                                        }
                                        visited[i] = 2;
                                        for (int j = 0; j < adj.get(i).size(); j++) {
                                            if ((visited[adj.get(i).get(j)] != 1)) {
                                                if (cycle(adj.get(i).get(j), adj, visited)) return true;
                                                    
                                                
                                            }
                                        }
                                        visited[i] = 1;
                                        return false;

                                    }

}
