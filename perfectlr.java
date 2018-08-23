/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class perfectlr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		int count=0;
		++l;
		for(int i=l;i<r;i++)
		{
			if(isPerfect(i))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	static boolean isPerfect(int i)
	{
		double sr=Math.sqrt(i);
		return(sr-Math.floor(sr)==0);
	}
}
