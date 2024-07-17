// /GOLDMINE COLLECTING MAXX GOLD 2D DP

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int r= 5;
        int c =r;
        int[][] arr={{1,2,3,0,2},{2,1,2,7,6},{5,2,8,3,1},{4,3,2,0,0},{8,0,1,1,0}};
        int[][] dp= new int[r][c];
        
        for (int i=0 ; i<r ;i++)
        {
            dp[i][c-1]=arr[i][c-1];
        }
        
        for(int j=c-2 ; j >=0 ; j--)
        {
            for(int k = 0 ; k< r ; k++)
            {
                if(k==0)
                {
                    dp[k][j]=arr[k][j] + Math.max(dp[k][j+1],dp[k+1][j+1]);
                    
                }
                else if(k==r-1)
                {
                    dp[k][j]=arr[k][j] + Math.max(dp[k][j+1],dp[k-1][j+1]);
                }
                else
                {
                    dp[k][j] = arr[k][j]+Math.max(dp[k][j+1],Math.max(dp[k+1][j+1],dp[k-1][j+1]));
                }
            }
        }
        int ans=0;
        for(int i=0 ; i< r ;i++)
        {
            ans=Math.max(ans,dp[i][0]);
        }
        System.out.println(ans);
	}
}
