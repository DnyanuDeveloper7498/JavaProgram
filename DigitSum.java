
import java.util.Scanner;

class DigitSum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Numbers :");
		int num=sc.nextInt();
		int sum=0;
		.
		while (num>0)
		{
			int last=num%10;
			sum = sum+last;
			num/=10;
		}
		
		System.out.println("Total Sum of numbers:"+sum);
	
	}
}
