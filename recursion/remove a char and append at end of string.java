// remove a char and append at end of string 
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String s="axbcxxc";
	    StringBuilder n =new StringBuilder();
	    elementmover(0,s,0,'x',n);

	}
	
	public static void elementmover(int idx ,  String s , int count, char element,StringBuilder n)
	
	{
	    if(idx==s.length()){
	        for(int i =0 ; i<=count ; i++)
	        {
	            n.append(element);
	        }
	        System.out.println(n);
	        
	        
	    }
	    
	    else if(s.charAt(idx)==element) 
	    {
	        count++;
	    }
	    else n.append(s.charAt(idx));
	    elementmover(idx+1,s,count,element,n);
	}
}
