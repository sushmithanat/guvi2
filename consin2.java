/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class consin2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int count=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]>=a[i+1])
			{
			count++;
			}
			else if(a[i+1]>=a[i])
			{
			count++;
			}
		}
		for(int i=0;i<n-1;i++)
		{
			if(count==1)
			{
			if(a[i]>=a[i+1])
			{
			System.out.print(a[i]);
			break;
			}
			else if(a[i+1]>=a[i])
			{
			System.out.print(a[i+1]);
			break;
			}
			}
			else
			{
			if(a[i]>=a[i+1])
			{
			System.out.print(a[i]);
			System.out.print(" ");
			count--;
			}
			else if(a[i+1]>=a[i])
			{
			System.out.print(a[i+1]);
			System.out.print(" ");
			count--;
			}
			}
		}
		
		
	}
}
