
import java.util.Scanner;

class PrintOddDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter a Digit :");
		int digit = sc.nextInt();
		
		int odd;
		
		while (digit>0)
		{ 
			odd = digit%10;
			if (odd%2!=0)
			{
			  System.out.println(odd);
			}
			
			digit/=10;
		}
	}
}
