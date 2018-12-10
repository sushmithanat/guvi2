/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class smallcm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int lcm=n1>n2?n1:n2;
		while(true)
		{
			if(lcm%n1==0 && lcm%n2==0)
			{
				System.out.print(lcm);
				break;
			}
			lcm++;
		}
	}
}
