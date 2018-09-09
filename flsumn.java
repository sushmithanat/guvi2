/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class flsumn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n1=Integer.parseInt(str.substring(0,1));
		int n2=Integer.parseInt(str.substring(str.length()-1,str.length()));
		int sum=Math.abs(n1+n2);
		System.out.print(sum);
	}
}
