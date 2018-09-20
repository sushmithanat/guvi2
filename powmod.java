/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class powmod
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		long a1=a;
		while(b!=1)
		{
		a1 *= a;
		--b;
		}
		a1 %= c;
		System.out.println(a1);
	}
}
