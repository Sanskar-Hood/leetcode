//DP  variable climbing stairs with min moves

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr={3,2,4,2,0,2,3,1,2,2};
        Integer[]dp = new Integer[n+1];
        dp[n]=0;
	    
	    for(int j=n-1;j>=0;j--)
	    {
	        
	        if(j==n-1){dp[j]=1;}
	        if (arr[j]==0){dp[j]=Integer.MAX_VALUE;
	        int var=arr[j];
	        for (int k=1; k<=var && k+j <=n ; k++)
	        {
	            int min=Math.min(min,dp[i+j]);
	            dp[j]=min+1;
	        }
	        
	    }
	    System.out.println(dp[0]); 
	  
	}
}
