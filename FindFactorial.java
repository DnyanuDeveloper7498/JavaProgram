
import java.util.Scanner;
class FindFactorial 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		
		factorialFind(num);
	}
	
   public static void  factorialFind(int num)
	{
		int fact=1;
		
		while (num!=0)
		{
			fact*=num;
			num--;
		}
		System.out.println(fact);
	}
}
