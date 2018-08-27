/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class stringcont
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int count=0;
		if(str2.length()>str1.length())
		{
			System.out.print("no");
		}
		else
		{
				if(str1.contains(str2))
					System.out.print("yes");
				else
					System.out.print("no");	
		}
	}
}
