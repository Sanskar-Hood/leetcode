// coin change permutation memoization
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int []arr ={2,3,5};
	    int tar=7;
	    int []dp1 = new int[tar+1];
	    int ans =helper(tar,arr,dp1);
	    System.out.println(ans);
	    
	}
	
	public static int helper(int tar, int[] arr, int []dp ){
	    
	    if(tar==0) return 1;
	    if(tar<0) return 0;
	    
	    
	    if(dp[tar]!=0) return dp[tar];
	    int ans=0;
	    for(int i= 0 ;i <arr.length ; i++){
	        
	        ans+=helper(tar-arr[i],arr,dp);
	    }
	    dp[tar]=ans;
	    return ans;
	}
	
}
