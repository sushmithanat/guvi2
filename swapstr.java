/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class swapstr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuffer sb=new StringBuffer();
		if(str.length()%2==0)
		{
		for(int i=0;i<str.length()-1;i=i+2)
		{
			char a=str.charAt(i);
			char b=str.charAt(i+1);
			sb.append(b).append(a);
		}
		System.out.println(sb);
		}
		else
		{
		for(int i=0;i<str.length()-1;i=i+2)
		{
			char a=str.charAt(i);
			char b=str.charAt(i+1);
			sb.append(b).append(a);
		}
		sb.append(str.charAt(str.length()-1));
		System.out.println(sb);
		}
		
	}
}
