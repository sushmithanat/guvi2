/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sumpl
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev += rem;
			n /= 10;
		}
		n=rev;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum = sum*10+rem;
			n /= 10;
		}
		if(sum==rev)
		System.out.print("YES");
		else
		System.out.print("NO");
	}
}
