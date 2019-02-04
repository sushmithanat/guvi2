/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class gcfac
{
	static int gcd(int a,int b)
	{
		if(a==0)
		return b;
		if(b==0)
		return a;
		if(a==b)
		return a;
		if(a>b)
		return gcd(a-b,b);
		return gcd(b-a,a);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int a=1,b=1;
		for(int i=1;i<=a1;i++)
		a *= i;
		for(int i=1;i<=b1;i++)
		b *= i;
		System.out.print(gcd(a,b));
	}
}
