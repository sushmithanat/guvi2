/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class decnb
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[256];
		int count=0;
		while(n>0)
		{
			a[count]=n%2;
			n /= 2;
			count++;
		}
		for(int i=count-1;i>=0;i--)
		System.out.print(a[i]);
	}
}
