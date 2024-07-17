// coin change permutation
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scn =new Scanner(System.in);
	    int n = scn.nextInt();
	    int [] arr = new int[n];
	    for(int i=0 ;i<n ;i++)
	    {
	        arr[i]=scn.nextInt();
	    }
	    int tar =scn.nextInt();
	    int []dp = new int[tar+1];
	    
	    dp[0]=1;
	    
	    for(int j=1 ;j<=tar ;j++){
	        for(int i = 0 ; i<=n-1 ; i++){
	            if(j-arr[i]>=0)
	            {
	                dp[j]+=dp[j-arr[i]];
	            }
	        }
	    }
	    System.out.println(dp[tar]);
	    
	    
	}
	
}
