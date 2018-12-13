/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strrot
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int k=sc.nextInt();
		ArrayList<Character> a=new ArrayList<Character>();
		for(int i=0;i<str.length();i++)
		a.add(str.charAt(i));
		Collections.rotate(a,k);
		for(char aa:a)
		System.out.print(aa);
	}
}
