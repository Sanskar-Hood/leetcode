// coin change combinarion memoization
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[]arr = {2,3,5};
	    int tar=7;
	    int[][] dp = new int[arr.length][tar + 1];
	    for(int i=0; i<arr.length ;i++){
	        Arrays.fill(dp[i],-1);
	    }
	    int res =helper(arr.length-1,7,arr,dp);
	    System.out.println(res);
	    

	}
	
	public static int helper(int idx, int tar, int[]arr,int[][]dp)
	{
	    if(tar==0) return 1;
	    if(tar<0) return 0;
	    if(idx<0) return 0;
	    
	    
	   // int ans=0;
	    dp[idx][tar]= helper(idx, tar-arr[idx],arr,dp)+helper(idx-1,tar,arr,dp);
	    return dp[idx][tar];
	   // return ans ;
	}
}
