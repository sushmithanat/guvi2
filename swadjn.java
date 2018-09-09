/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class swadjn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		if(n%2==0)
		{
			for(int i=0;i<n;i++)
			{
				if(i%2==0)
				{
					int tmp=a[i];
					a[i]=a[i+1];
					a[i+1]=tmp;
				}
				i++;
			}
			int count=n;
			for(int i=0;i<n;i++)
			{
				if(count==1)
				{
				System.out.print(a[i]);
				break;
				}
				else
				{
				System.out.print(a[i]);
				System.out.print(" ");
				count--;
				}
				
			}
		}
		else
		{
			for(int i=0;i<n-1;i++)
			{
				if(i%2==0)
				{
					int tmp=a[i];
					a[i]=a[i+1];
					a[i+1]=tmp;
				}
				i++;
			}
			int count=n;
			for(int i=0;i<n;i++)
			{
				if(count==1)
				{
				System.out.print(a[i]);
				break;
				}
				else
				{
				System.out.print(a[i]);
				System.out.print(" ");
				count--;
				}
				
			}
		}
	}
}
