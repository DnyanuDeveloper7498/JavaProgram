
import java.util.Scanner;

class ButterFlyPattern 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter How Many starprint:");
		int n = sc.nextInt();
		
		int totalLine =2*n, currentLine=1,star=1,space=2*n-2;
		
		 while (currentLine <= totalLine)
		 {
			 
			 //Star 
			 
			 for (int i=1;i<=star ; i++)
			 {
				 System.out.print("*");
			 }
			 
			 //space 
			 
			 for (int i=1;i<=space ;i++ )
			 {
				 System.out.print(" ");
			 }
			 
			 // Star
			 for (int i=1;i<=star ;i++ )
			 {
				 System.out.print("*");
			 }
			 
			  
			 // next line Preparation
			 
			 if (currentLine<n)
			 {
				star++;
				space =space -2;
			 }
			 else 
			 {
		      star--;
			  space =space+2;
			
			 }
			 
			 System.out.println();
			 
			
			 currentLine++;
			 
			 
			 
			 
		 }
		
		
		
		
		
		
	}
}
