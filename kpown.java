/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class kpown
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int i=0;
		for(i=0;i<=k;i++)
		{
			if(k==(int) Math.pow(n,i))
			{
				System.out.print("yes");
				break;
			}
		}
		if(i>k)
			System.out.print("no");	
	}
}
