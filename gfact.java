/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class gfact
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int af=1,bf=1,gcd=1;
		for(int i=1;i<=a;i++)
		af *= i;
		for(int i=1;i<=b;i++)
		bf *= i;
		for(int i=1;i<=af && i<=bf;i++)
		{
			if(af%i==0 && bf%i==0)
			gcd=i;
		}
		System.out.print(gcd);
	}
}
