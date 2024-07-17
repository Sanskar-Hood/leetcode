package two_pointers;

// import java.lang.reflect.Array;
import java.util.Arrays;

public class most_profit_assigning {
    public static void main(String[] args) {
        int[]difficulty = {2,4,6,8,10};
        int[]profit = {10,20,30,40,50};
        int[] worker = {4,5,6,7};
        System.out.println(maxProfitAssignment(difficulty, profit, worker));
    }

    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxdif=0;
        for(int i=0 ;i < difficulty.length ;i++){
             maxdif=Math.max(difficulty[i], maxdif);
        }
        int[]dp = new int[maxdif+1];

        Arrays.fill( dp,0);

        for(int i=0 ;i < difficulty.length ;i++){
            dp[difficulty[i]]=Math.max(dp[difficulty[i]], profit[i]);
        }

        
        for(int i=1 ; i <dp.length ;i++){
            dp[i]=Math.max(dp[i], dp[i-1]);
        }
        int ans=0;
        for(int num : worker){
            if(num<=maxdif) ans+=dp[num];
            else ans+=dp[maxdif];
        }
        return ans;

    }
}
