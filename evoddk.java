/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class evoddk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
		if(n%2==0)
		{
		int count=1;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]==a[i+1])
			count++;
		}
		System.out.print(count);
		}
		else
		{
		int count=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]==a[i+1])
			count++;
		}
		System.out.print(count);	
		}
	}
}
