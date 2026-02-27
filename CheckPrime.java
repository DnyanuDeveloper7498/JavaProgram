
import java.util.Scanner;

class CheckPrime  
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter a Number:");
		int num = sc.nextInt();
		
		int den=2;
		
		while (den<=num)
		{
			if (num%den==0)
			{
				break;
			}
			den++;
		}
		if (num==den)
		{
			System.out.println("Number is Prime ");
		}
		  else 
		{
			System.out.println("Number is Not Prime");
		}
	}
}
