/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class numeo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1="";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			str1 += str.charAt(i);
		}
		int a=Integer.parseInt(str1);
		while(a!=0)
		{
			int rem = a%10;
			sum += rem;
			a /= 10;
		}
		if(sum%2==0)
		System.out.print("E");
		else
		System.out.print("O");
	
	}
}
