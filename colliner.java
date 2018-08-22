/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class colliner
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		if(x1==x2 && x2==x3 && x3==x1)
			System.out.println("yes");
		else if(y1==y2 && y2==y3 && y3==y1)
			System.out.println("yes");
		else
		{
			int a = x1 * (y2 - y3) + x2*(y3 - y1)+x3 * (y1 - y2);
			if (a == 0)
			 System.out.println("yes");
			else
            		System.out.println("no");
		}
	}
}
