/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strcmpl
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		String str11=str1.toLowerCase();
		String str22=str2.toLowerCase();
		if(str11.length()!=str22.length())
			System.out.println("no");
		else
		{
			if(str11.equals(str22))
			System.out.println("yes");
			else
			System.out.println("no");
		}
	}
}
