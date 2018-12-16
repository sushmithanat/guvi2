/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class rem1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int j=0;
		int[] tmp=new int[n];
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			tmp[j++]=a[i];
		}
		int[] b=new int[j];
		for(int i=0;i<j;i++)
		b[i]=tmp[i];
		if(j==0 && a.length==2)
		System.out.print(a[0]);
		else if(a.length==1)
		System.out.print(a[0]);
		else
		{
		for(int i=0;i<j;i++)
		{
			if(i==j-1)
		    System.out.print(b[i]);
		    else
		    System.out.print(b[i]+" ");
		}
		}
	}
}
