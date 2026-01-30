import java.util.Scanner;

class Demo 
{
	
	
	public static void main(String[] args) 
	{ 
		
	   Scanner sc =new Scanner(System.in);
	   

       System.out.println("Eneter a Name :-");
	   
	     String name = sc.nextLine();
		 
		 if (name=="")
		 {
			 System.out.println("Plese Eneter Your Name ");
			 
		 }
		 else 
		{
			 System.out.println("SuceessFull Login");
		}
	   
		
	}
}
