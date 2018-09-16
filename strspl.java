/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strspl
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.next();
		String[] ar=str.split(" ");
		int j=0;
		for(int i=0;i<ar.length;i++)
		{
			if(str1.equals(ar[i]))
			{
				j=i;
				break;
			}
		}
		System.out.print(j+1);
	}
}
