// import java.util.HashSet;
import java.util.Scanner;

// import javax.sql.rowset.spi.SyncResolver;

public class bitwise_and {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr= new int[n];
        for(int i=0 ;i <n ; i++){
            arr[i]=scn.nextInt();
        }
        int[]dp = new int[n];
        int ans=1;
        for(int i=0 ;i<n ;i++){
            dp[i]=1;
        }
        for(int i=1 ; i<n ; i++){
            for(int j=0 ; j<i ;j++){
                if(arr[i]>arr[j] && ((arr[j] & arr[i]) * 2 < (arr[j] | arr[i])) ){
                    dp[i]=Math.max(dp[i],dp[j]+1);

                }
            }
            ans=Math.max(ans, dp[i]);
        }
        System.out.println(ans);
        scn.close();
    }
}
