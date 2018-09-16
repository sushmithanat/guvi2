/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int[] pre=new int[n];
		int count=n;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			pre[i] += a[j];
		}
		for(int i=0;i<n;i++)
		{
			if(count==1)
			{
			System.out.print(pre[i]);
			break;
			}
			else
			{
			System.out.print(pre[i]);
			System.out.print(" ");
			count--;
			}
		}
		
	}
}
