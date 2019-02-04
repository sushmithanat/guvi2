/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class extrast
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String st="";
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ' || str.charAt(i)>=33 && str.charAt(i)<=126)
			st += str.charAt(i);
		}
		st += str.charAt(str.length()-1);
		System.out.println(st);
	}
}
