import java.util.Scanner;

class TwinPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter a Number:");
		int n1 =sc.nextInt();
		
		System.out.println("Enter a number:");
		int n2 = sc.nextInt();
		
		
		if ((n1-n2)==2 || (n1-n2)==-2)
		{
			int den=2;
			while (den<=n1)
			{
			  if (n1%den==0)
			  {
				  break;
			  }
			  den++;
			}
			 
		 if (n1==den)
		 {
				  den=2;
				 while (den<=n2)
				 {
					 if (n2%den==0)
					 {
						 break;
					 }
					 den++;
				 }
				 if(n2==den)
				 {
					 System.out.println("Yes Twin Prime ");
				 }
					 else 
					 {
						System.out.println("Not Twin Prime");
					  }
		 }
			 else 
			{
				 System.out.println("Not Twin Prime ");
			}
		}
		else 
		{
			System.out.println("Not Twin Prime ");
		}
		
	}
}
