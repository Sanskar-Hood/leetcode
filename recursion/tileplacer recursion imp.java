// tileplacer recursion imp

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    int n=4;
	    int m=2;
	    System.out.println(tileplacer(n,m));
	}
	
	public static int tileplacer(int n,int m )
	{
	    
	    if(m>n) return 1;
	    if(n==m) return 2;
	    return tileplacer(n-1,m) + tileplacer(n-m,m);
	    
	}
}
