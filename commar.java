/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class commar
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[m];
		int[] c=new int[n+m];
		int count=0,count1=0,countd=0;
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<m;i++)
		b[i]=sc.nextInt();
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
			if(a[i]==b[j])
			{
			c[count++]=a[i];
			count1++;
			}
			}
		}
		int[] d=new int[count];
		for(int i=0;i<count-1;i++)
		{
		if(c[i]!=c[i+1])
		{
		d[countd++]=c[i];
		}
		}
		d[countd++]=c[count-1];
		for(int i=0;i<countd;i++)
		{
			if(count1==1)
			{
			System.out.print(d[i]);
			break;
			}
			else
			{
			System.out.print(d[i]);
			System.out.print(" ");
			count1--;
			}
		}
		
	}
}
