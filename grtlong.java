/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class grtlong
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s,str;
		char b;
		int c=0,i,l,p=0,max=0;;
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader y=new BufferedReader(x);
		//System.out.println("ENTER A STRING");
		s=y.readLine();
		s=s.concat(" ");
		l=s.length();
		for(i=0;i<l;i++)
		{
			b=s.charAt(i);
			if(b!=' ')
			{
				c=c+1;
			}
			else
			{
				if(c>max)
				{
					max=c;
					p=i;
				}
				c=0;
			}
		}
		str=s.substring(p-max,p);
		System.out.print(str);
	}
}
