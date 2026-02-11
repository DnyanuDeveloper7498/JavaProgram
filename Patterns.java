
//import java.util.Scanner;

class Patterns
{
	public static void main(String[] args) 
	{
	  //Scanner sc= new Scanner(System.in);
	  
	  //System.out.print("Eneter How many stars print:");
	  
	  //int n = sc.nextInt();
	  
	  int n=5;
	  
	  int totalLine =n;
	  
	  int space = 1;
	  
	  int stars =n;
	  
	  int current=1;
	  
	  
	  while(current<=totalLine)
		{
		  
		   for (int i=1;i<=stars;i++)
		  {
			  System.out.print("*");
		  }
		  
		  //  space 
		  
		  for (int i =1;i<=space; i++)
		  {
			  System.out.print(" ");
		  }
		  
		
		  System.out.println();
		
		      stars--;
			  
			  space++;
			  
			  current++;
		
		  
		   
		  
		}
		 
		
		
		
		
		
		
		
		
		
		
	}
}
