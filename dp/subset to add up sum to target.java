// subset to add up sum to target
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef 
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int target = 10;
        int[] arr = {4, 2, 7, 1, 3};
        boolean[][] dp = new boolean[arr.length + 1][target + 1];
        
        for (int i = 0; i <= arr.length; i++)
        {
            dp[i][0] = true;
        }
        
        for (int j = 1; j <= target; j++)
        {
            dp[0][j] = false;
        }
        
        for (int i = 1; i <= arr.length; i++)
        {
            for (int j = 1; j <= target; j++)
            {
                if (j < arr[i - 1])
                {
                    dp[i][j] = dp[i - 1][j];
                }
                else
                {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }
        
        System.out.println(dp[arr.length][target]);
    }
}
