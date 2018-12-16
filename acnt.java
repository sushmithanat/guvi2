/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class acnt
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='b')
			{
				
			}
			else
			cnt++;
		}
		if(cnt==0 || cnt==1)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
