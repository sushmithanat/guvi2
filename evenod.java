/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class evenod
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int count1=0,count2=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			count2++;
			else
			count1++;
		}
		if(count1>count2)
		{
			for(int i=0;i<n;i++)
			{
				if(a[i]%2==0)
				{
					System.out.print(a[i]);
					break;
				}
			}
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				if(a[i]%2==1)
				{
					System.out.print(a[i]);
					break;
				}
			}	
		}
	}
}
