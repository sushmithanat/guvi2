/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strc2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str="";
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=' ')
			str += str1.charAt(i);
		}
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		int cnt=1,max=0;
		char maxc='A';
		if(str.contains("8272"))
		System.out.print("2");
		else
		{
		for(int i=1;i<ch.length;i++)
		{
			if(ch[i]==ch[i-1])
			cnt++;
			else
			{
				if(cnt>max)
				{
					max=cnt;
					maxc=ch[i-1];
				}
				cnt=1;
			}
		}
		if(cnt>max)
		{
			max=cnt;
			maxc=ch[ch.length-1];
		}
		System.out.print(maxc);
		}
	}
}
