/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class mirrim
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		int cnt=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==b[n-1-i])
			{
				
			}
			else
				cnt=1;
		}
		if(cnt==1)
		System.out.println("no");
		else
		System.out.println("yes");
	}
}
