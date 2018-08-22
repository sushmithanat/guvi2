/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class gcdn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1==n2)
			System.out.println(n1);
		else if(n1>n2)
		{
			for(int i=n1;i>=2;i--)
			{
				if(n1%i==0 && n2%i==0)
				{
					System.out.println(i);
					break;
				}
			}
		}
		else
		{
			for(int i=n2;i>=2;i--)
			{
				if(n1%i==0 && n2%i==0)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}
}
