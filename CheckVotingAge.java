
import java.util.*;

class CheckVotingAge 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Your Age :-");
		
		 int age = sc.nextInt();
		 
		 if (age>=18)
		 {
			 System.out.println("You Eligible For Voting ");
		 }
		 else 
		{
		    System.out.println("You Not Eligible For Voting");   	 
		}
		
	}
}
