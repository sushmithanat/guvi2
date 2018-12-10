/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class kabalirk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		str[i]=sc.next();
		String st="";
		int cnt=0;
		for(int i=0;i<n;i++)
		{
			st=str[i];
			char[] ch=st.toCharArray();
			Arrays.sort(ch);
			if(ch.length==6)
			{
				if(ch[0]=='a' && ch[1]=='a' && ch[2]=='b' && ch[3]=='i' && ch[4]=='k' && ch[5]=='l')
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}
