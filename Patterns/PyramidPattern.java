//Pyramid  Pattern 

import java.util.Scanner;

class PyramidPattern
{
	public static void main(String[] args) 
	{
		
       Scanner sc =new Scanner(System.in);
	
	   System.out.print("Eneter a number Print pattern:-");
	    int n = sc.nextInt();
		
		int totalLine=n , star=1, space=n-1, currentLine=0;
		
		
		while (currentLine<=totalLine)
		{
			// space print 
			
			for (int i=1;i<=space ;i++ )
			{
				System.out.print("  ");
			}
			
			// star Print 
			
			for (int i=1;i<=star ;i++ )
			{
				System.out.print("* ");
			}
			
			// next Line preparation
			
			System.out.println();
			
			star=star+2;
			space--;
			currentLine++;
			
				
		}
			
	}
}
