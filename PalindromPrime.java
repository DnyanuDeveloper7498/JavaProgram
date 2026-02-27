
import java.util.Scanner;


class  PalindromPrime
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter a Number:");
		int num=sc.nextInt();
	   
		int rev=0 , org=num;
        int den=2;	
		while(org!=0)
		{
			int last= org%10;
			rev=rev*10+last;
			org/=10;
		}
		if (rev==num)
		{
			while (den<rev)
			{
			  if (rev%den==0)
			  {
				  break;
			  }
			  den++;
			}
			if (den==rev)
			{
				System.out.println("is a Palindrome Prime number!");
			}
			 else 
			{
				 System.out.println("The number is a Palindrome but not Prime.");
			}
		}
		 else 
		{
			 System.out.println("Not plindrome");
		}
		
	}
}
