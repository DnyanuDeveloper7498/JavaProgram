
import java.util.Scanner;

class FindFactor 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter a num: ");
		int num = sc.nextInt();
		
		factorFind(num);
	}
	
	public static void factorFind(int num)
	{
		int den=1;
		
		while (den<=num)
		{
			if (num%den==0)
			{
				System.out.println(den);
			}
			den++;
		}
		
	}
}
