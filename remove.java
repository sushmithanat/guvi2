/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class remove
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		String str1="";
		for(int i=0,j=0;i<str.length();i++)
		{
			if(str.charAt(i)==65 || str.charAt(i)==69 || str.charAt(i)==73 || str.charAt(i)==79 || str.charAt(i)==85)
				j++;
			else if(str.charAt(i)==97 || str.charAt(i)==101 ||str.charAt(i)==105 || str.charAt(i)==111 || str.charAt(i)==117)
				j++;
			else
			{
			str1 += str.charAt(j);
			j++;
			}
		}
		for(int i=str1.length()-1;i>=0;i--)
			System.out.print(str1.charAt(i));
	}
}
