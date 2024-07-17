//min cost path 2dp

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr={{1,2,2,10,20},{20,3,0,1,3},{4,30,2,0,1},{1,0,3,2,5}};
        int r=4;
        int c =5;
        int[][]dp = new int[r][c];
        dp[r-1][c-1]=arr[r-1][c-1];
	    
	    for(int i=c-2 ; i>=0 ; i--)
	    {
	        dp[r-1][i] = arr[r-1][i]+dp[r-1][i+1];
	         
	    }
	    
	     for(int j=r-2 ; j>=0 ; j--)
	    {
	        dp[j][c-1] = arr[j][c-1]+dp[j+1][c-1];
	        
	    }
	    
	    
	    for(int i= r-2 ; i>=0 ; i--)
	    {
	        for(int j = c-2 ; j>=0 ; j--)
	        {
	            dp[i][j]=arr[i][j]+Math.min(dp[i+1][j],dp[i][j+1]);
	        }
	    }
	    System.out.println(dp[0][0]); 
	  
	}
}
