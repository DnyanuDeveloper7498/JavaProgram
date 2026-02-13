
import java.util.Scanner;

class DigitPrintEven 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("Eneter a Digit:");
	    int digit= sc.nextInt();
	    
		int even;
		
		while (digit>0)
		{
			even=digit%10;
			
			if (even%2==0)
			{
				System.out.println(even);
			}
			
	      digit/=10;
		}		
		
	}
}
