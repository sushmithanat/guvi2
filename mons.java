/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class mons
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str=str1.substring(3,5);
		switch(str)
		{
			case "01":System.out.print("January");
					  break;
			case "02":System.out.print("February");
					  break;
			case "03":System.out.print("March");
					  break;
			case "04":System.out.print("April");
					  break;
			case "05":System.out.print("May");
					  break;
			case "06":System.out.print("June");
					  break;
			case "07":System.out.print("July");
					  break;
			case "08":System.out.print("August");
					  break;
			case "09":System.out.print("September");
					  break;
			case "10":System.out.print("October");
					  break;
			case "11":System.out.print("November");
					  break;
			case "12":System.out.print("December");
					  break;
		}
	}
}
