
import java.util.Scanner;

class CountDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter a Digit:");
		int num = sc.nextInt();
		
		int count=0;
		
		while (num>0)
		{
			count++;
			num/=10;
		}
		
		System.out.println("Total Digit:"+ count);
	}
}
