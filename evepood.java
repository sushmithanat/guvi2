/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class evepood
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				if(a[i]%2!=0)
				{
					count++;
				}
			}
			else
			{
				if(a[i]%2==0)
				{
					count++;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(count==1)
			{
			if(i%2==0)
			{
				if(a[i]%2!=0)
				{
					System.out.print(a[i]);
				}
			}
			else
			{
				if(a[i]%2==0)
				{
					System.out.print(a[i]);
				}
			}
			}
			else
			{
			if(i%2==0)
			{
				if(a[i]%2!=0)
				{
					System.out.print(a[i]+" ");
				}
			}
			else
			{
				if(a[i]%2==0)
				{
					System.out.print(a[i]+" ");
				}
			}
			count--;
			}
		}
	}
}
