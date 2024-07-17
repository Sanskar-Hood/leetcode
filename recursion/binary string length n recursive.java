// binary string length n recursive
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     
	    int n=4;
	    
	    
	    int ans =helper(1,n);
	    System.out.println(ans);
	    
	}
	
	public static int helper(int prev, int n){
	    
	    if(n==1){
	    if (prev == 0) return 1;
	    else return 2;}
	    
	    
	    int ans=0;
	    if(prev==0 ) ans= helper(1,n-1);
	    else  ans= helper(1,n-1)+helper(0,n-1);
	    return ans;
	   
	   
	}
	
}
