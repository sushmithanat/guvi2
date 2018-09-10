/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strinn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		int count=0,tmp=0;
		for(int i=0;i<=n;i++)
		{
			count=0;
			for(int j=0;j<str.length();j++)
			{
				if(Integer.parseInt(str.substring(j,j+1))==i)
				count=1;
			}
			if(count==1)
			tmp++;
		}
		if(tmp==n+1)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
