/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arra2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[k];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int j=0;j<k;j++)
		b[j]=sc.nextInt();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.print(a[n-1]+" "+b[k-1]);
	}
}
