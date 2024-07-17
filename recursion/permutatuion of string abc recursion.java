// permutatuion of string abc recursion
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String s="abc";
	    permutationofstr("",s,2);
	}
	
	public static void permutationofstr(String permu , String s , int idx )
	{
	    if(idx<0) {
	        System.out.println(permu);
	        return ;
	    }
	    for(int i=idx ; i>=0 ;i--){
	        
	        char r=s.charAt(i);
	        String newS = s.substring(0, i) + s.substring(i + 1);
	        permutationofstr(permu+r ,newS,idx-1);
	    }
	}
}
