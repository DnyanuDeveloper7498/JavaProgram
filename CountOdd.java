
import java.util.Scanner;

class CountOdd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter a Digit :");
		int digit = sc.nextInt();
		
		int odd;
		int count=0;
		
		while (digit>0)
		{ 
			odd = digit%10;
			if (odd%2!=0)
			{
			  count++;
			}
			
			digit/=10;
		}
		
		System.out.println("Total odd Number:"+ count);
	}
}
