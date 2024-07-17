import java.util.ArrayList;
import java.util.List;
class atlantic_and_pacific_oceans {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows=heights.length;
        int cols=heights[0].length;
        boolean [][] pac =new boolean[rows][cols];
        boolean [][] atl =new boolean[rows][cols];
        List<List<Integer>> al =new ArrayList<>();

        for(int i=0 ; i<cols ; i++){
            dfs(0,i,heights,pac,heights[0][i]);
        }
        for(int i=0 ; i<cols ; i++){
            dfs(rows-1,i,heights,pac,heights[rows-1][i]);
        }
        for(int i=0 ; i<rows ; i++){
            dfs(i,0,heights,atl,heights[i][0]);
        }
        for(int i=0 ; i<rows ; i++){
            dfs(cols-1,i,heights,atl,heights[cols-1][i]);
        }

        for(int i=0 ; i<rows ; i++){
            for(int j=0 ; j<cols ; j++){
                if(pac[i][j] ==true && atl[i][j]==true){
                    List<Integer> a = new ArrayList<>(); // Mistake: should be List<Integer> not int[]
                    a.add(i);
                    a.add(j);
                    al.add(a);
                }
            }
        }
        return al;

        
    }
    public static void dfs(int i, int j , int[][] heights , boolean[][]visited ,int prev){
        if(i==heights.length || j==heights[0].length || visited[i][j]==true || i<0 || j<0 || prev>heights[i][j] ){
            return;
        } 
        visited[i][j]=true;
        dfs(i+1, j, heights, visited, heights[i][j]);
        dfs(i-1, j, heights, visited,  heights[i][j]);
        dfs(i, j-1, heights, visited,  heights[i][j]);
        dfs(i, j+1, heights, visited,  heights[i][j]);
    }
}