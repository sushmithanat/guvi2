/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arraycom
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n-i;j++)
			{
				if(b[i]>b[j])
				{
					int tmp=b[i];
					b[i]=b[j];
					b[j]=tmp;
				}
			}
		}
		int k,count=0;
		for(k=0;k<n;k++)
		{
			if(a[k]==b[k])
			{
				count++;	
			}
			else
			{
				System.out.print("no");
				break;
			}
		}
		if(count>k)
			System.out.print("yes");
	}
}
