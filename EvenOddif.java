
import java.util.Scanner;

class EvenOddif 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter Number:-");
		int num =sc.nextInt();
	
		 if (num%2==0)
		{
			System.out.println(num + " num is Even");
		}
		
		else
		{
			 System.out.println(num + "Num is odd");
			
		}
		 
	} 
}
