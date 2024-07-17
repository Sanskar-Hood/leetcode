import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="abaacdaefaah";
		int first=-1;
		int last=-1;
		
		 
		rev(0,s,first,last);
		

	}
	
	public static void rev(int idx , String s,int first, int last )
	
	{
	    if(idx==s.length())
	    {
	        if(last==-1) last=first;
	        System.out.println(first);
	        System.out.println(last);
	    }
	    else{
	        if(s.charAt(idx)=='a')
	        {
	            if(first==-1){
	                first=idx;
	            }
	            else{
	                last=idx;
	            }
	        }
	        rev(idx+1,s,first,last);
	    }
	    
	 
	}
}
