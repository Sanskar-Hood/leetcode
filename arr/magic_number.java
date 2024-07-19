import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class magic_number {
      public List<Integer> luckyNumbers (int[][] matrix) {
        int[] rows =new int[matrix.length];
        List<Integer> ans = new ArrayList<Integer>();
        Arrays.fill(rows,100001);
        for(int i=0 ;i <matrix.length ;i++){
            for(int j=0 ;j < matrix[0].length ;j++){
                rows[i]=Math.min(rows[i],matrix[i][j]);
            }
        }
   
        int idx=0;
        for(int j=0 ; j<matrix[0].length ;j++){
            int max=-1;
            for(int i=0 ;i < matrix.length ;i++){
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                    idx=i;
                }
                
            }
            if(rows[idx]==max){
                ans.add(max);
            }
        }
        return ans;
    }
}
