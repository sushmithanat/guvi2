/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class matrc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		n *= n;
		int[] a=new int[n*n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int cnt=0;
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				if(a[0]==1 && a[1]==0 || a[0]==0 && a[1]==1)
				cnt++;
			}
			/*else if(i==n-1)
			{
				if(a[n-1]==1 && a[n-2]==0 || a[n-1]==0 && a[n-2]==1)
				cnt++;
			}*/
			else if(a[i]==1 && a[i-1]==0 && a[i+1]==0)
			cnt++;
		}
		System.out.print(cnt);
	}
}
