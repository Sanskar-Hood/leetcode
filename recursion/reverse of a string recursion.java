import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="abcd";
		 
		int n= (s.length() )-1  ;
		rev(n,s);
		

	}
	
	public static void rev(int n , String s )
	{
	    if(n==0)
	    {
	        System.out.println(s.charAt(n));
	        return  ;
	    }
	    else 
	    {   
	        System.out.println(s.charAt(n));
	        rev(n-1,s);
	        
	    }
	}
}
