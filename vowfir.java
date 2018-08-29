/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class vowfir
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
				str1 += str.charAt(i);
		}
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)>='b' && str.charAt(i)<='d') || (str.charAt(i)>='f' && str.charAt(i)<='h') || (str.charAt(i)>='j' && str.charAt(i)<='n') || (str.charAt(i)>='p' && str.charAt(i)<='t') || (str.charAt(i)>='v' && str.charAt(i)<='z'))
				str1 += str.charAt(i);
		}
		System.out.print(str1);
	}
}
