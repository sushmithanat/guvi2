/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class primn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int count=0,n=n1,j=0;
		for(int i=1;i<=n1;i++)
		{
			if(n1%i==0)
			count++;
		}
		int[] a=new int[count];
		for(int i=1;i<=n1;i++)
		{
			if(n1%i==0)
			{
			a[j]=i;
			j++;
			}
		}
		int count1=0,count2=0;
		for(int i=0;i<count;i++)
		{
			count1=0;
			for(int k=2;k<a[i];k++)
			{
				if(a[i]%k==0)
				{
					count1=1;
				}
			}
			if(count1==0)
			count2++;
		}
		--count2;
		for(int i=1;i<count;i++)
		{
			count1=0;
			for(int k=2;k<a[i];k++)
			{
				if(a[i]%k==0)
				{
					count1=1;
				}
			}
			if(count1==0)
			{
				if(count2==1)
				{
				System.out.print(a[i]);
				}
				else
				{
				System.out.print(a[i]);
				System.out.print(" ");
				count2--;
				}
			}
		}
		
		
		
	}
}
