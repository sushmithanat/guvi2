/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class stroccn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char c=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
			{
			count++;
			}
		}
		System.out.println(count);
	}
}
