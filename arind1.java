/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arind1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int i,j,k=0,count=0;
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int[] c=new int[n];
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		b[i]=a[i];
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(b[i]>b[j])
				{
					int tmp=b[i];
					b[i]=b[j];
					b[j]=tmp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
			if(a[i]==b[j])
			{
			c[k]=j+1;
			k++;
			count++;
			}
			}
		}
		for(i=0;i<n;i++)
		{
			if(count==1)
			{
			System.out.print(c[i]);
			break;
			}
			else
			{
			System.out.print(c[i]);
			System.out.print(" ");
			count--;
			}
		}
		
	}
}
