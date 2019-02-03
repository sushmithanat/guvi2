/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class atlole
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String[] a=new String[n];
		for(int i=0;i<n;i++)
		a[i]=sc.next();
		int cnt=0,count=0;
		for(int i=0;i<n;i++)
		{
			String str=a[0];
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)=='a' || str.charAt(j)=='e' || str.charAt(j)=='i' || str.charAt(j)=='o' || str.charAt(j)=='u')
				{
					cnt++;
				}
			}
		}
		if(cnt>=k)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
