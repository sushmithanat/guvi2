/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class greak
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int tmp=0;
		Arrays.sort(a);
		if(n==1)
		tmp=a[0];
		else
		{
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				if(a[i+1]!=k)
				{
				tmp=a[i+1];
				break;
				}
			}
		}
		}
		System.out.print(tmp);
	}
}
