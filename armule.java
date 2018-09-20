/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class armule
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		long mul=1;
		for(int i=0;i<n;i++)
		mul *= a[i];
		if(mul%2==0)
		System.out.print("even");
		else
		System.out.print("odd");
	}
}
