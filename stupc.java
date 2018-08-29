/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class stupc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<str.length();i++)
		{
			Character c=sb.charAt(i);
			if(Character.isLowerCase(c))
			sb.replace(i,i+1,Character.toUpperCase(c)+"");
			else
			sb.replace(i,i+1,Character.toLowerCase(c)+"");
		}
		System.out.println(sb);
	}
}
