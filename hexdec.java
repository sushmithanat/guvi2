/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class hexdec
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int val=0;
		String digits="0123456789ABCDEF";
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			int d=digits.indexOf(c);
			val = val*16+d;
		}
		System.out.print(val);
	}
}
