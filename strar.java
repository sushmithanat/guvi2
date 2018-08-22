/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strar
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=n;
		String[] str=new String[n];
		for(int i=0;i<n;i++)
			str[i]=sc.next();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n-i-1;j++)
			{
				if(str[i].compareTo(str[j])<0)
				{
					String tmp=str[i];
					str[i]=str[j];
					str[j]=tmp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(cnt==1)
			{
			System.out.print(str[i]);
			break;
			}
			else
			{
			System.out.print(str[i]);
			System.out.print(" ");
			cnt--;
			}
			
		}
	}
}
