/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ksmp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int cnt=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				System.out.print(k);
				cnt=1;
				break;
			}
		}
		Arrays.sort(a);
		if(n==1 && cnt==0)
		System.out.print(a[0]);
		else if(cnt==0)
		{
			for(int i=n-1;i>=0;i--)
			{
				--k;
				if(a[i]==k)
				{
					System.out.print(a[i]);
					break;
				}
			}
		}
	}
}
