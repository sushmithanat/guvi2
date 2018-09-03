/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arrmer2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int i=0,j=0;
		int[] a=new int[n];
		int[] b=new int[k];
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(i=0;i<k;i++)
		b[i]=sc.nextInt();
		int n1=n+k,cnt=n+k;
		int[] d=new int[n1];
		for(i=0,j=0;i<n;i++,j++)
		d[i]=a[i];
		j=n;
		for(i=0;i<k;i++,j++)
		d[j]=b[i];
		Arrays.sort(d);
		for(i=0;i<n1;i++)
		{
		if(cnt==1)
		{
		System.out.print(d[i]);
		break;
		}
		else
		{
		System.out.print(d[i]);
		System.out.print(" ");
		cnt--;
		}
		}
		
	}
}
