/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class nummax
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=n,cnt=0,i=0;
		while(n>0)
		{
			int rem=n%10;
			cnt++;
			n /= 10;
		}
		int[] a=new int[cnt];
		while(n1>0)
		{
			int rem=n1%10;
			a[i++]=rem;
			n1 /= 10;
		}
		Arrays.sort(a);
		for(i=cnt-1;i>=0;i--)
		System.out.print(a[i]);
	}
}
