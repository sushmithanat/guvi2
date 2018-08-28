/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class parect
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int a=sc.nextInt();
		int count=0;
		p /= 2;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=p;j++)
			{
				if(i+j==p && i*j==a)
				{
					count=1;
					break;
				}
			}
		}
		if(count==1)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
