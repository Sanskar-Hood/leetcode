import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int target=7;
		int []arr= {2,3,5};
		int n = arr.length ;
		int []dp = new int[target+1];
		
		for (int i=0 ; i<=target ;i++)
		{
		    dp[i]=0;
		}
		dp[0]=1;
		
		for (int i =0 ; i<=n - 1 ; i++ )
		{
		    for(int j = arr[i] ; j <=target ; j++)
		    {
		        if(j-arr[i]>=0)
		       { dp[j]=dp[j]+dp[j-arr[i]];}
		    }
		}
		
		System.out.println(dp[target]);

	}
}
