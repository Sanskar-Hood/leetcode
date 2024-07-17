import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class course_scheduler_2 {
    public static void main(String[] args) {
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] order = findOrder(4, prerequisites);
        
        // Printing the result array
        System.out.print("[");
        for (int i = 0; i < order.length; i++) {
            System.out.print(order[i]);
            if (i < order.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]); // Correct direction for prerequisites
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] onPath = new boolean[numCourses]; // Additional array to track nodes in the current path
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (dfs(i, visited, onPath, stack, graph)) {
                    return new int[0]; // Return empty array if a cycle is detected
                }
            }
        }

        int[] order = new int[numCourses];
        int i = 0;
        while (!stack.isEmpty()) {
            order[i++] = stack.pop();
        }
        return order;
    }

    public static boolean dfs(int curr, boolean[] visited, boolean[] onPath, Stack<Integer> stack, List<List<Integer>> graph) {
        if (onPath[curr]) {
            return true; // Cycle detected
        }
        if (visited[curr]) {
            return false; // Already processed
        }

        visited[curr] = true;
        onPath[curr] = true; // Mark current node as being visited in the current path
        for (int neighbor : graph.get(curr)) {
            if (dfs(neighbor, visited, onPath, stack, graph)) {
                return true;
            }
        }
        onPath[curr] = false; // Unmark the current node
        stack.push(curr);
        return false;
    }
}
