// target sum subset using recursion 
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	   Scanner scn = new Scanner(System.in);
	   
	   int n =scn.nextInt();
	   int []arr=new int [n];
	   
	   for(int i=0 ;i<n ; i++)
	   {
	       arr[i]=scn.nextInt();
	       
	   }
	   int tar =scn.nextInt();
	   sumsofsubset(0,"",tar,arr,0);
	}
	
	public static void sumsofsubset(int idx ,  String set , int tar, int [] arr, int sum)
	{
	
	    if(idx==arr.length)
	    {
	        if(tar == sum)
	        System.out.println(set);
	        return;
	        
	    }
	         
	        
	        
	    
	    sumsofsubset(idx+1,set+arr[idx]+",", tar,arr,sum+arr[idx]);
	    sumsofsubset(idx+1,set, tar,arr,sum);
	    
	  
	}
}
