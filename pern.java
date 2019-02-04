/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pern
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int cnt=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i+1]-a[i]==1)
			cnt++;
		}
		if(cnt>0)
		{
			if(a[n-1]-a[n-2]==1)
			cnt++;
		}
		if(cnt==n)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
