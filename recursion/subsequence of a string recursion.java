// subsequence of a string recursion

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s ="abc";
		subsequenc(s,"",0);
		

	}
	public static void subsequenc(String s, String n , int idx)
	{
	    if(idx==s.length()){
	        System.out.println(n);
	        return;
	    }
	    
	     subsequenc(s,n+s.charAt(idx),idx+1);
	      subsequenc(s,n,idx+1);
	    
	}
}
