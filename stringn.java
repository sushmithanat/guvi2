/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class stringn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		String str1="",str2="",strm="";
		if(str.length()==n)
			System.out.println(str);
		else
		{
		for(int i=str.length()-1;i>0;i--)
		{
			str1 += str.charAt(i);
		}
		for(int i=0;i<n;i++)
		{
			str2 += str1.charAt(i);	
		}
		for(int i=str2.length()-1;i>=0;i--)
		{
			strm += str2.charAt(i);	
		}
		System.out.print(strm);
		}
	}
}
