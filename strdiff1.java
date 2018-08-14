/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strdiff1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int count=0,count1=0;
		if(str1.length()!=str2.length())
		{
			System.out.println("no");
		}
		else
		{
			for(int i=0;i<str1.length();i++)
			{
				if(str1.charAt(i)==str2.charAt(i))
				{
					count1=0;
				}
				else
				{
					count++;
				}
			}
			if(count1==0 && count==1)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
