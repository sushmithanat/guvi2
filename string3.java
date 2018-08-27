/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class string3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.length()<=3)
			System.out.print(str.charAt(0));
		else
		{
			for(int i=0;i<str.length();i++)
			{
				if(i%3==0)
				System.out.print(str.charAt(i));
			}
		}
	}
}
