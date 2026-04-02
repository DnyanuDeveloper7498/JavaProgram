
import java.util.Scanner;
class PalidromicPrime 
{
	public static void main(String[] args) 
	{
	     System.out.print("Enter a Number:");
		 int num = new Scanner(System.in).nextInt();
		
		if (isPrime(num))
		{
			if (isPalidrom(num))
			{
				System.out.println("Yes Palindromic Prime Number");
			}
			else 
			{
				System.out.println("Not Palindromic Prime Number");
			}
		}
		 else 
		{
			   System.out.println("Not Palindromic Prime Number");
		}
	}
	
	public static boolean isPrime(int num)
	{
		int den=2;
		
		while (den<num)
		{
			if (num%den==0)
			{
				break;
			}
			den++;
		}
		return den==num;
	}
	
	public static boolean isPalidrom (int num)
	{
	    int rev=0;
		int temp=num;
		while (num!=0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		return rev==temp;
	}
	
}
