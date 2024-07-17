// count binary string of length n using 2d dp
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n=4;
		int [][]dp=new int [2][n+1];
		
		dp[0][0]=0;
		dp[1][0]=1;
		
		for(int i = 1 ; i <= n ;i++)
		{
		    for(int j = 0 ; j<=1 ; j++){
		        if(j==0) dp[j][i]=dp[j+1][i-1];
		        else dp[j][i]=dp[j-1][i-1]+dp[j][i-1];
		    }
		   
		}
		
		int ans = dp[0][n]+dp[1][n];
		System.out.println(ans);

	}
}
