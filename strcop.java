/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strcop
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int n1=str1.length();
		int n2=str2.length();
		int c1=0,c2=0,j=0;
		for(int i=2;i<=n1;i++)
		{
			if(n1%i==0)
			c1++;
		}
		for(int i=2;i<=n2;i++)
		{
			if(n2%i==0)
			c2++;
		}
		int[] a=new int[c1];
		int[] b=new int[c2];
		for(int i=2;i<=n1;i++)
		{
			if(n1%i==0)
			a[j++]=i;
		}
		j=0;
		for(int i=2;i<=n2;i++)
		{
			if(n2%i==0)
			b[j++]=i;
		}
		int cnt=0;
		if(c1>=c2)
		{
		for(int i=0;i<c1;i++)
		{
			for(int k=0;k<c2;k++)
			{
				if(a[i]==b[k])
				{
					cnt=1;
					break;
				}
			}
		}
		}
		else
		{
		for(int i=0;i<c2;i++)
		{
			for(int k=0;k<c1;k++)
			{
				if(b[i]==a[k])
				{
					cnt=1;
					break;
				}
			}
		}
		}
		if(cnt==1)
		System.out.print("no");
		else
		System.out.print("yes");
		
	}
}
