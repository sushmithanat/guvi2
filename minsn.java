/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class minsn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int sum=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]>a[i+1])
			sum += a[i];
			else if(a[i+1]>a[i])
			sum += a[i+1];
			else if(a[i]==a[i+1])
			sum += a[i];
		}
		System.out.print(sum);
	}
}
