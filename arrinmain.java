/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arrinmain
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int max=a[0],min=a[0],maxi=0,mini=0;
		int[] b=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		b[i]=a[i];
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(b[i]>b[j])
				{
					int tmp=b[i];
					b[i]=b[j];
					b[j]=tmp;
				}
			}
		}
		min=b[0];
		max=b[n-1];
		for(int i=0;i<n;i++)
		{
			if(a[i]==min)
			{
			mini=i;
			break;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==max)
			{
			maxi=i;
			break;
			}
		}
		int res=maxi-mini;
		System.out.print(res);
		
	}
}
