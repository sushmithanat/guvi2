/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arrayl
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(n==2)
		{
			for(int i=0;i<n-1;i++)
			{
				int tmp=a[i];
				a[i]=a[i+1];
				a[i+1]=tmp;
			}
			for(int i=0;i<n;i++)
			{
				if(i==n-1)
				System.out.print(a[i]);
				else
				{
					System.out.print(a[i]);
					System.out.print(" ");
				}
			}
		}
		else
		{
		for(int i=0;i<=k;i++)
		{
			int tmp=a[0];
			for(int j=0;j<n-1;j++)
			{
				a[j]=a[j+1];
				if(j==n-2)
				a[j+1]=tmp;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(i==n-1)
				System.out.print(a[i]);
			else
				System.out.print(a[i]);
				System.out.print(" ");
		}
		}
	}
}
