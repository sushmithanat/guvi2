/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class factab
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long fact1=1,fact2=1;
		for(long i=1;i<=a;i++)
		fact1 *= i;
		for(long i=1;i<=b;i++)
		fact2 *= i;
		long pro=fact1/fact2;
		System.out.print(pro);
	}
}
