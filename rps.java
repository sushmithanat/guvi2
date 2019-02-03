/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class rps
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		char p1=sc.next().charAt(0);
		char p2=sc.next().charAt(0);
		if(p1=='R' && p2=='P' || p2=='R' && p1=='P')
		System.out.print("P");
		else if(p1=='P' && p2=='S' || p2=='P' && p1=='S')
		System.out.print("S");
		else if(p1=='R' && p2=='S' || p2=='R' && p1=='S')
		System.out.print("R");
		
	}
}
