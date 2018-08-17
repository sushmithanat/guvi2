/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Encode
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{			
				if(str.charAt(i)=='x')
				{
				System.out.print("a");
				}
				else if(str.charAt(i)=='y')
				{
				System.out.print("b");
				}
				else if(str.charAt(i)=='z')
				{
				System.out.print("c");
				}
				else
				{
				int j=str.charAt(i)+3;
				char d=(char) j;
				System.out.print(d);
				}
			}
			else if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{			
				if(str.charAt(i)=='X')
				{
				System.out.print("A");
				}
				else if(str.charAt(i)=='Y')
				{
				System.out.print("B");
				}
				else if(str.charAt(i)=='Z')
				{
				System.out.print("C");
				}
				else
				{
				int j=str.charAt(i)+3;
				char d=(char) j;
				System.out.print(d);
				}
			}
		}
	}
}
