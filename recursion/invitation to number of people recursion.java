// invitation to number of people
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=4;
		System.out.println(choices(4));

	}
	
	public static int choices(int n)
	{
	    if(n==1) return 1;
	    if(n==2) return 2;
	    
	    return choices(n-1)+((n-1)*(choices(n-2)));
	}
}
