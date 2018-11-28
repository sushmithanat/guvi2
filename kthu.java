/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class kthu
{
	public static void main (String[] args) throws java.lang.Exception
	{
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
				cnt=1;
				break;
			}
			else
			cnt=0;
		}
		if(cnt==1)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
