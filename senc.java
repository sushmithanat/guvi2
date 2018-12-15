/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class senc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str=sc.next();
		String[] a=s.split(" ");
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equals(str))
			cnt++;
		}
		System.out.print(cnt);
	}
}
