/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pressum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=n;
		int[] a=new int[n];
		int[] suf=new int[n];
		int[] pre=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		suf[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--)
		suf[i]=suf[i+1]+a[i];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
			pre[i] += a[j];
			}
		}
		for(int i=0;i<n;i++)
		{
		pre[i] +=suf[i];
		}
		if(n==1)
		System.out.print(a[0]);
		else
		{
		for(int i=0;i<n;i++)
		{
			if(count==1)
			{
			System.out.print(pre[i]);
			break;
			}
			else
			{
			System.out.print(pre[i]);
			System.out.print(" ");
			count--;
			}
		}
		}
		
		
		
		
	}
}
