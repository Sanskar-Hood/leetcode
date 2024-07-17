//DP climbing stairs

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[]dp = new int[n+1];
        
        int ans = climb(0,n,dp);
        System.out.println(ans);
  
	}
	public static int climb(int i, int n , int []dp)
	
	{
	    if (dp[n]!=0) return dp[n];
	    if (i>n) return 0;
	    if (i==n) return 1;
	   int ans=climb(i+1,n, dp)+climb(i+2,n, dp)+climb(i+3,n,dp);
	   dp[i]=ans;
	   return ans;
	}
}
