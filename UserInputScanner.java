
import java.util.Scanner;


class UserInputScanner 
{
	public static void main(String[] args) 
	{
		
		
      Scanner sc = new Scanner(System.in);
	  
	    System.out.println("Enter Your Name: ");
		 
		 String name =sc.nextLine();
		 
		 System.out.println("Eneter Your Age: ");
		 
		  byte age = sc.nextByte();
		  
		  System.out.println("Eneter Your CGPA: ");
		  
		  float cgpa=sc.nextFloat();
		    sc.nextLine();
		  
		  
		   System.out.println("Eneter Your Greade: ");
		  
		     char greade = sc.nextLine().charAt(0);
		  
		      System.out.println("Eneter Your Branch: ");
		  
		    String branch= sc.nextLine();
		   
		    System.out.println("Your Name :-" +name);
		  
		    System.out.println("Your Age:- " +age);
			
			System.out.println("Your CGPA:- "+cgpa); 
			
			System.out.println("Your Grede :- "+ greade);
			
			System.out.println("Your Branch:" + branch);
				   
	}
}
