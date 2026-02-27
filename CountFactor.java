
import java.util.Scanner;

class CountFactor 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter a Number:");
		int num=sc.nextInt();
		
		int den=1 ,cnt=0;
		
		while (den<=num/2)
		{
			if (num%den==0)
			{
				cnt++;
				
			}
			
			den++;
		}
		System.out.println(cnt);
		
	}
}
