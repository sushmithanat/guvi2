/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class atlo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] a=new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		int cnt=0;
		for(int i=0;i<n;i++)
		{
			String str=a[i];
			if(str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u"))
			{
				cnt++;
			}
		}
		if(cnt==n)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
