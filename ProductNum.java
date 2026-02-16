
import java.util.Scanner;

class ProductNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Numbers :");
		int num=sc.nextInt();
		int product=1;
		
		while (num>0)
		{
			int last=num%10;
			product= product*last;
			num/=10;
		}
		
		System.out.println("Product of numbers:"+ product);
	
	}
}
