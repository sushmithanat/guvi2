/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class lastk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		n=n-k;
		for(int i=0;i<n;i++)
		count++;
		for(int i=0;i<n;i++)
		{
			if(count==1)
			{
			System.out.print(a[i]);
			break;
			}
			else
			{
			System.out.print(a[i]);
			System.out.print(" ");
			count--;
			}
		}
		
	}
}
