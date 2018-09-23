/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class unique
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		Arrays.sort(a);
		int count=0,count1=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
				if(a[i]==a[j])
				{
				count =1;	
				break;
				}
				else
				{
				count=0;
				}
				}
			}
			if(count==1)
			{
				System.out.print(a[i]);
				count1=1;
				break;
			}
		}
		if(count1==0)
		System.out.print("unique");
	}
}
