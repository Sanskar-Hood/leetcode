import java.util.Arrays;

class buy_and_Sell_cooldown {
    public static void main(String[] args) {
        
        int[] prices = {1,2,3,0,2};
        Integer[][] dp = new Integer[prices.length ][2];
        for (int i = 0; i < prices.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(helper(prices, 0, 0,dp));
    }
    

    public static int  helper(int[]prices , int i , int bag,Integer[][]dp){
        if(i>=prices.length) return 0;

        if(dp[i][bag]!=-1) return dp[i][bag];
        if(bag==0){
            int opt2 = -prices[i]+helper(prices, i+1, 1,dp);
            int opt3 = helper(prices, i+1, 0,dp);
            return dp[i][bag]=Math.max(opt2, opt3);
        }
        else{
            int opt1 = prices[i]+helper(prices, i+2, 0,dp);
            int opt3 = helper(prices, i+1, 1,dp);
            return dp[i][bag]=Math.max(opt1, opt3);

        }
        
    }
    
}
