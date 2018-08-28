/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class commc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int count=0;
			for(int i=0;i<str1.length();i++)
			{
				if(str1.charAt(i)==str2.charAt(i))
				{
					System.out.print("yes");
					count=1;
					break;
				}
			}
			if(count==0)
			{
				System.out.print("no");	
			}
		
	}
}
