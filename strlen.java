/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strlen
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str += '\0';
		int count=0;
		for(int i=0;str.charAt(i)!='\0';i++)
		{
			count++;
		}
		System.out.println(count);
	}
}
