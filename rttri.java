/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class rttri
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max=0;
		if(a>b)
		{
			if(a>c)
			max=a;
		}
		else if(b>c)
		max=b;
		else
		max=c;
		max *= max;
		a *= a;
		b *= b;
		if((a+b)==max)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
