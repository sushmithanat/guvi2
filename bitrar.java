/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class bitrar
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int bit=0;
		if(n==1)
		System.out.print(a[0]);
		else
		{
			for(int i=0;i<n-1;i++)
			{
				bit=a[i]|a[i+1];
			}
			System.out.print(bit);
		}
	}
}
