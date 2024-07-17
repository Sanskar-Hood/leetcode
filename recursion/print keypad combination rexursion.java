// print keypad combination rexursion 
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String code="23";
		String [] sa= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
		combination(code , "", 0 , sa);
	 
	}
	
	public static void combination(String code ,String n ,int idx,String [] sa)
	{
	    if(idx==code.length()) {
	        System.out.println(n);
	        return;
	    }
	    char curr= code.charAt(idx);
	    String mapping= sa[curr-'0'];
	    
	    for(int i=0 ; i<mapping.length() ; i++){
	        
	        combination(code,n+mapping.charAt(i),idx+1,sa);
	        
	    }
	}
}
