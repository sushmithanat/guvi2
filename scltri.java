/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class scltri
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int ab=a+b,ac=a+c,bc=b+c;
		int cnt=0;
		if(ab>=c && bc>=a && ac>=b)
		{
			if(a!=b && b!=c && c!=a)
			cnt=1;
		}
		if(cnt==1)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
