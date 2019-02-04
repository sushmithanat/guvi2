/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sprims
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] a=str.split(" ");
		int n=0;
		for(int i=0;i<a.length;i++)
		{
			String s=a[i];
			n += s.length();
		}
		int cnt=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				cnt=1;
				break;
			}
		}
		if(cnt==0)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
