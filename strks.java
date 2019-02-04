/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String[] a=new String[n];
		for(int i=0;i<n;i++)
		a[i]=sc.next();
		int cnt=0;
		Arrays.sort(a);
		for(int i=0;i<n-1;i++)
		{
			if(a[i].equals(a[i+1]))
			{
				cnt++;
			}
		}
		if(cnt>0)
			if(a[n-1].equals(a[n-2]))
			cnt++;
		if(cnt==k)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
