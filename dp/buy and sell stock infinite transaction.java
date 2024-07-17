// buy and sell stock infinite transaction
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
	   
	   int buy=0;
	   int sell =0;
	   int profit=0;
	   
	   for(int i=1 ; i<arr.length ; i++)
	   {
	       if(arr[i]>=arr[i-1])
	       {
	           
	           sell++;
	       }
	       else{
	           profit+=arr[sell]-arr[buy];
	           buy=sell=i;
	       }
	       
	   }
	   profit+=arr[sell]-arr[buy];
	   System.out.println(profit);
	}
	

}
