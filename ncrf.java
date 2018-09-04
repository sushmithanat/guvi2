/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ncrf
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int fact1=1,fact2=1,fact3=1;
		for(int i=1;i<=n;i++)
		{
			fact1=fact1*i;
		}
		for(int i=1;i<=k;i++)
		{
			fact2=fact2*i;
		}
		for(int i=1;i<=(n-k);i++)
		fact3=fact3*i;
		int c=fact2*fact3;
		int p=fact1/c;
		System.out.print(p);
	}
}
