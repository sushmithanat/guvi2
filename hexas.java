/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class hexas
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
			{
				count++;
			}
			else if(str.charAt(i)>=65 && str.charAt(i)<=69)
			{
				count++;
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=101)
			{
				count++;
			}
		}
		if(str.length()==count)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
