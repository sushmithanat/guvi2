import java.util.Scanner;
class even
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long num=sc.nextLong();
    if(num<=0)
      System.out.println("Invalid");
    else if(num%2==0)
      System.out.println("Even");
    else
      System.out.println("Odd");
    }
 }
