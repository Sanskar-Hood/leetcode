import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String s ="abaac"; 
	    int max=0;
	    int count=0;
	    for(int i=0; i < s.length() ; i++)
	    {
	        if (s.charAt(i)== 'a' || s.charAt(i)== 'e'|| s.charAt(i)== 'i'|| s.charAt(i)== 'o'|| s.charAt(i)== 'u' ) 
	        {
	            count++;
	             max=Math.max(count,max);
	        }
	        else
	        {
	            
	            count=0;
	        }
	    }
	    System.out.println(max);
	}
}
