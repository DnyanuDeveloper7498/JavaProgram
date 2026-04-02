
import java.util.Scanner;

class CheckPalindrom 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		 
		 if (palindromic(num))
		 {
			 System.out.println("Number is Palindrom");
		 }
		 else
		{
			 System.out.println("Number is not a Palindrom");
		}
	 
	}
	
	public static int reversNum(int num)
	{
		int temp=num;
		int rev=0;
		while (temp!=0)
		{
			int last =temp%10;
			rev=rev*10+last;
			temp/=10;
		}
		return rev;
	}
	
	public static boolean palindromic(int num)
	{
	     if (num==reversNum(num))
	     {
			 return true;
	     }
		  else
		{
			return false;
		}
	}
}
