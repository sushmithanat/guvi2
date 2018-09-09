/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class inkps
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int p=sc.nextInt();
		int k=sc.nextInt();
		p +=k-1;
		String sub=str.substring(p,p+1);
		System.out.print(sub);
	}
}
