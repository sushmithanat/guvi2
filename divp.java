/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class divp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int cnt=0,j=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i+1]%a[i]==0)
			cnt += 1;
		}
		int[] b=new int[cnt];
		for(int i=0;i<n-1;i++)
		{
			if(a[i+1]%a[i]==0)
			{
			b[j]=a[i+1];
			j++;
			}
		}
		for(int i=0;i<cnt;i++)
		{
			if(i==cnt-1)
			{
				System.out.print(b[i]);
				break;
			}
			else
			{
				System.out.print(b[i]+" ");
			}
		}
	}
}
