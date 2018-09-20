/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class bina2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n!=1)
		{
			if(n%2!=0)
			{count=1;
			break;
			}
			else
			n /= 2;
		}
		if(count==0)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
