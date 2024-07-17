// binary string length n memoization
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     
	    int n=4;
	    
	    int [][] dp =new int[2][n+1];
	    int ans =helper(1,n,dp);
	    System.out.println(ans);
	    
	}
	
	public static int helper(int prev, int n , int [][] dp){
	    
	    if(n==1){
	        if(prev==0) return 1;
	        else return 2;
	    }
	    if(dp[prev][n]!=0) return dp[prev][n];
	    
	    
	    int ans=0;
	    if(prev==0 ) ans= helper(1,n-1,dp);
	    else  ans= helper(1,n-1,dp)+helper(0,n-1,dp);
	    
	    dp[prev][n]=ans;
	    return ans;
	   
	   
	}
	
}
