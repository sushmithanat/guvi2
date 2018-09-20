/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class bins1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int in=0,count=0,i=0;
		int[] a=new int[50];
		while(n>0)
		{
			a[in++]=n%2;
			n /= 2;
		}
		for(i=in-1;i>=0;i--)
		{
			if(a[i]==1)
			count++;
		}
		System.out.print(count);
	}
}
