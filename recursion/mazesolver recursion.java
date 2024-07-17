// mazesolver recursion 
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int r=2;
	    int c=3;
	    int count=mazesolver(0,0,r,c,0);
	    System.out.println(count);
	    
	}
	
	public static int mazesolver(int m,int n, int r, int c, int count)
	{
	    if(n==r && m==c) {
	       
	        return 1;}
	    if(n>r) return 0;
	    if(m>c) return 0;
	    
	    return mazesolver(m+1,n,r,c,count)+mazesolver(m,n+1,r,c,count);
	    
	}
}
