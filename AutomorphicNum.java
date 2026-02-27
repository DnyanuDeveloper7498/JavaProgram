
import java.util.Scanner;

class AutomorphicNum
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Number: ");

		int num=sc.nextInt();


		int temp=num;
		int sq=temp*temp;

		int ans=0,mul=1;

	while( temp!=0)
	{

	   int last=sq%10;

		ans=mul*last+ans;
		mul*=10;
	  
	   temp/=10;
	   sq/=10;
	  
	}
		if(num==ans)
		{
			System.out.println("Number is Autotrophic");
		}
		 else 
		{
			 System.out.println("Number is Not Autotrophic");
		}


	}
}
