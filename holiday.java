/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class holiday
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		switch(str)
		{
			case "Monday":System.out.println("no");
				break;
			case "Tuesday":System.out.println("no");
				break;
			case "Wednesday":System.out.println("no");
				break;
			case "Thursday":System.out.println("no");
				break;
			case "Friday":System.out.println("no");
				break;
			case "Saturday":System.out.println("yes");
				break;
			case "Sunday":System.out.println("yes");
				break;
		}
	}
}
