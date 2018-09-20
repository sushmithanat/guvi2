/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strrems
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.next();
		int count=0;
		String[] c=str.split(" ");
		for(int i=0;i<c.length;i++)
		{
			if(c[i].equals(str1))
			{
				
			}
			else
			{
				count++;
			}
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i].equals(str1))
			{
				
			}
			else
			{
				if(count==1)
				{
					System.out.print(c[i]);
					break;
				}
				else
				{
					System.out.print(c[i]);
					System.out.print(" ");
					count--;
				}
			}
		}
		
	}
}
