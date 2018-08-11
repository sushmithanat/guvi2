/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class isostr1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int count1=0,count2=0;
		for(int i=0;i<str1.length()-1;i++)
		{
			if(str1.charAt(i)==str1.charAt(++i))
			{
				count1++;
				break;
			}
		}
		for(int i=0;i<str2.length()-1;i++)
		{
			if(str2.charAt(i)==str2.charAt(++i))
			{
				count2++;
				break;
			}
		}
		if(count1>0 && count2>0)
		{
			if(count1==count2)
			System.out.println("no");
		}
		else
			System.out.println("yes");
			
	}
}
