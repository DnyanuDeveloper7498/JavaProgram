
import java.util.Scanner;

class  PowerOfNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a base:");
		int base = sc.nextInt();
		
		System.out.println("Eneter a raise:");
		int rais = sc.nextInt();
		 
		 int result=1;
		 
		 while(rais>0)
		{
			 result=result*base;
			 
			 rais--;
		}
		
		System.out.println(result);
	}
}
