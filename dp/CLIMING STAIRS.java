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
	        if (arr[j]!=0){
	            int val =Integer.MAX_VALUE;
	      
	        for (int k=1; k<=arr[j] && k+j <=n ; k++)
	        {
	             
	            if (dp[k+j]!=null) val=Math.min(val,dp[k+j]);
	        }
	        
	        if(val!= Integer.MAX_VALUE){
	            dp[j] = val+1;
	        }
	        }
	        
	    }
	    System.out.println(dp[0]); 
	  
	}
}
