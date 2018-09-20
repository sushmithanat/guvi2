/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class digr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		if(str1.length()<str2.length())
		{
			str2=str2.substring(0,str1.length());
			System.out.print(str1+str2);
		}
		else if(str2.length()<str1.length())
		{
			str1=str1.substring(0,str2.length());
			System.out.print(str1+str2);
		}
		else
		{
			System.out.print(str1+str2);	
		}
	}
}
