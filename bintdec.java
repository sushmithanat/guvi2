/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class bintdec
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long dec=0,p=0;
		while(n!=0)
		{
			dec += ((n%10)*Math.pow(2,p));
			n /= 10;
			p++;
		}
		System.out.print(dec);
	}
}
