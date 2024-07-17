// buy and sell stock finite transaction
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scn =new Scanner(System.in);
	    int n = scn.nextInt();
	    int [] arr = new int[n];
	    for(int i=0 ;i<n ;i++)
	    {
	        arr[i]=scn.nextInt();
	    }
	    int buy=arr[0];
	   // int sell=arr[0];
	    int pro=0;
	    
	    for(int i=1 ;i<arr.length ;i++){
	        if(arr[i]<buy)
	        {
	            buy=arr[i];
	        }
	        
	           // sell=arr[i];
	            pro=Math.max(pro,arr[i]-buy);
	        
	    }
	    System.out.println(pro);;
	}
	
}
