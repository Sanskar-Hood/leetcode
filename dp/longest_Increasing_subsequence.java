import java.util.Arrays;

public class longest_Increasing_subsequence {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(lengths(nums));

    }
        public static int lengths(int[] nums)
       { int n = nums.length;
        int res=1;
        int[] dp =new int[n];
        Arrays.fill(dp,1);
        if(nums==null || n==0) return 0;

        for(int i=1; i<n ;i++){
            for(int j=0 ; j<i ;j++){
                if(nums[i]>nums[j]){
                dp[i]=Math.max(dp[i], dp[j]+1);
            }
            res=Math.max(res,dp[i]);

        }
        }
        return res;

}

}
