/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class rgex
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==32)
			{
				++i;
				System.out.print(str.charAt(i));
			}
			else
			System.out.print(str.charAt(i));
		}
	}
}
