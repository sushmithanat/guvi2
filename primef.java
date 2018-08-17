/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class primef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			isPrime(i);
			}
		}
	}
	public static void isPrime(int i1)
	{
		int count=0,i=i1,j,countd=0,count1=0;
		for(j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			count1 += 1;
		}
		for(j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				countd++;
			}
		}
		if(countd==2)
		{
			if(count1==1)
			{
				System.out.print(i);
			}
			System.out.print(" ");
			/*else
			{
				System.out.print(i);
				System.out.print(" ");
				count1--;
			}*/
		}
	}
}
