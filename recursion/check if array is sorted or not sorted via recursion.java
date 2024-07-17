// check if array is sorted or not sorted via recursion
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int idx=1;
	    int []arr ={1,-1,3,4,5};
	    boolean res = sortedch(1,arr,arr[0]);
	    if(res) System.out.println("sorted");
	    else System.out.println("not sorted");
		

	}
	
	public static boolean sortedch(int idx , int[] arr , int prev)
	
	{
	    if(idx==arr.length){
	        return true;
	    }
	    
	    else if(arr[idx]>prev){
	        return sortedch(idx+1,arr,prev);
	    }
	    else return false;
	    
	    
	 
	}
}
