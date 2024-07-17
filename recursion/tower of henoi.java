import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(toh(3));

	}
	public static int toh (int n)
	{
	    if(n==1)
	    {
	        return 1;
	        
	    }
	    else{
	        return ((2*toh(n-1)+1));
	    }
	}
}
