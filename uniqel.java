/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class uniqel
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int tmp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;i++)
			{
				if(a[i]!=a[j] && i!=j)
				{
					tmp=a[i];
					break;
				}
			}
		}
		System.out.print(tmp);
	}
}
