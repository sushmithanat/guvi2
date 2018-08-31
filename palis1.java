/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class palis1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String dup="";
		int count=0;
		if(str.length()%2!=0)
		{
			System.out.print("no");
		}
		else
		{
		for(int i=str.length()-1;i>=0;i--)
		{
			dup +=str.charAt(i);	
		}
		for(int j=0;j<str.length();j++)
		{
			if(str.charAt(j)!=dup.charAt(j))
			count++;
		}
			if(count==2 || count==0)
			System.out.print("yes");
			else
			System.out.print("no");
		}
	}
}
