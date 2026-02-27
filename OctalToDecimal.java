
import java.util.Scanner;

class OctalToDecimal
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		
		int dec=0;
		int pos=1;
		
		while (num>0)
		{
			int rem=num%10;
			
			dec =(pos*rem)+dec;
			
			pos*=8;
			num/=10;
		}
		System.out.println(dec);
	}
}
