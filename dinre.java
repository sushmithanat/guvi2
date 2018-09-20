/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class dinre
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str2="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str2 +=str.charAt(i)+"-";	
		}
		for(int i=0;i<str2.length()-1;i++)
		System.out.print(str2.charAt(i));
	}
}
