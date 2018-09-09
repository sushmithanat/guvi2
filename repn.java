/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class repn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int count=0,i=0,cnt=0;
		long num=n;
		while(n>0)
		{
			long rem=n%10;
			count++;
			n /= 10;
		}
		long[] a=new long[count];
		while(num>0)
		{
			long rem=num%10;
			a[i]=rem;
			num /= 10;
			i++;
		}
		for(i=0;i<count;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(a[i]>a[j])
				{
				long tmp=a[i];
				a[i]=a[j];
				a[j]=tmp;
				}
			}
		}
		for(i=0;i<count-1;i++)
		{
			if(a[i]==a[i+1])
			{
				System.out.print("yes");
				cnt=1;
				break;
			}
		}
		if(cnt!=1)
		System.out.print("no");
	}
}
