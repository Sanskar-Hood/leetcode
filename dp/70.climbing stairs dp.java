import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc =new Scanner(System.in);
	    int n = sc.nextInt();
	    int []dp = new int[n+1];
	    
	    for(int i=n ; i>=0 ; i--)
	    {
	        if (i==n) {dp[i]= 1;}
	        else if (i==n-1) {dp[i]= 1;}
	        else  {dp[i]=dp[i+1]+dp[i+2];}
	    }
	    
	    System.out.println(dp[0]);
	}
}
