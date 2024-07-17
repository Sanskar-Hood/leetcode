// remove duplicate charcter via recursion and hashmap
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		boolean []map=new boolean[26];
		String s="abxxccad";
// 		String newstring="";
		characterremover("",s,map,0);
		
		

	}
	
	public static void characterremover(String newstring,String s , boolean []map ,int idx)
	{
	    if(idx==s.length()){
	        System.out.println(newstring);
	        return ;
	    }
	    
	    if(map[s.charAt(idx)-'a']) {
	        characterremover(newstring,s,map,idx+1);
	    }
	    else{
	        map[s.charAt(idx)-'a']=true;
	        characterremover(newstring+s.charAt(idx),s,map,idx+1);
	    }
	}
}
