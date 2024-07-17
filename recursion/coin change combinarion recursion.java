// coin change combinarion recursion
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[]arr = {2,3,5};
	    int tar=7;
	    int res =helper(arr.length-1,7,arr);
	    System.out.println(res);
	    

	}
	
	public static int helper(int idx, int tar, int[]arr)
	{
	    if(tar==0) return 1;
	    if(tar<0) return 0;
	    if(idx<0) return 0;
	    
	    
	   // int ans=0;
	    return helper(idx, tar-arr[idx],arr)+helper(idx-1,tar,arr);
	    
	   // return ans ;
	}
}
