/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class squarenum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sq=0;
		while(n>0)
		{
			int rem=n%10;
			sq += rem*rem;
			n /= 10;
		}
		System.out.println(sq);
	}
}
