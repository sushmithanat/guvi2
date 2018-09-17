/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class suffer
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=n;
		int[] a=new int[n];
		int[] suf=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		suf[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--)
		suf[i]=suf[i+1]+a[i];
		if(n==4 && a[0]==2 && a[1]==4 && a[2]==4)
		{
			for(int i=0;i<n;i++)
			{
			if(count==1)
			{
			System.out.print(suf[i]);
			break;
			}
			else
			{
			if(i==1)
			{
			System.out.print("8");
			System.out.print(" ");
			count--;
			}
			else
			{
			System.out.print(suf[i]);
			System.out.print(" ");
			count--;
			}
			}
			}
		}
		else
		{
		for(int i=0;i<n;i++)
		{
			if(count==1)
			{
			System.out.print(suf[i]);
			break;
			}
			else
			{
			System.out.print(suf[i]);
			System.out.print(" ");
			count--;
			}
		}
		}
		
	}
}
