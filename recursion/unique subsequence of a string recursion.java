// unique subsequence of a string recursion

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s ="aaa";
		HashSet<String> set = new HashSet<>();
		subsequenc(s,"",0,set);
		

	}
	public static void subsequenc(String s, String n , int idx, HashSet<String> set)
	{
	    if(idx==s.length()){
	        if(set.contains(n)){
	            return;
	        }

	        else{
	         set.add(n);
	        System.out.println(n);
	        
	        return;}
	    }
	    
	     subsequenc(s,n+s.charAt(idx),idx+1,set);
	      subsequenc(s,n,idx+1,set);
	    
	}
}
