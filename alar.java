/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class alar
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int cnt=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)=='a' && str.charAt(i+1)=='b')
			{
				cnt += 2;
			}
		}
		if(cnt>=0)
		{
			if(str.charAt(str.length()-2)=='b' && str.charAt(str.length()-1)=='a' || str.charAt(str.length()-2)=='a' && str.charAt(str.length()-1)=='b')
			cnt++;
		}
		System.out.print(cnt);
	}
}
