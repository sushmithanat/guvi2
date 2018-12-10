/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strcr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String st="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			st += str.charAt(i);
		}
		st=st.toLowerCase();
		int i=0;
		int[] cnt=new int[256];
		for(i=0;i<st.length();i++)
		{
			cnt[(int)st.charAt(i)]++;
		}
		int n=i;
		String stri="";
		for(i=0;i<n;i++)
		{
			if(cnt[(int)st.charAt(i)]==1)
			stri += st.charAt(i);
		}
		for(i=0;i<stri.length();i++)
		{
			if(stri.length()-1==i)
			{
				System.out.print(stri.charAt(i));
				break;
			}
			else
			{
				System.out.print(stri.charAt(i)+" ");
			}
		}
	}
}
