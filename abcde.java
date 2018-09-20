/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class abcde
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int n1=0,n2=0;
		if(n%2!=0)
		{
		n1=(n/2);n2=n-n1;
		}
		else
		{
		n1=n/2;n2=n-n1;
		}
		int[] a1=new int[n1];
		int[] a2=new int[n2];
		for(int i=0;i<n1;i++)
		a1[i]=a[i];
		int j=0;
		for(int i=n1;i<n;i++,j++)
		a2[j]=a[i];
		Arrays.sort(a1);
		for(int i=0;i<n2;i++)
		{
			for(j=i+1;j<n2;j++)
			{
				if(a2[i]<a2[j])
				{
				int tmp=a2[i];
				a2[i]=a2[j];
				a2[j]=tmp;
				}
			}
		}
		int count=n;
		if(count==1)
		System.out.print(a[0]);
		else
		{
		for(int i=0;i<n1;i++)
		{
		System.out.print(a1[i]);
		System.out.print(" ");
		count--;
		}
		for(int i=0;i<n2;i++)
		{
		if(count==1)
		{
		System.out.print(a2[i]);
		break;
		}
		else
		{
		System.out.print(a2[i]);
		System.out.print(" ");
		count--;
		}
		}
		}
		
	}
}
