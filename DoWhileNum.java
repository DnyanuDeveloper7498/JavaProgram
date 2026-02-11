
// print a number usign do while loop

import java.util.Scanner;

class DoWhileNum 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		   System.out.print("Eneter Start Number:");
		   int start = sc.nextInt();
		   
		   System.out.print("Eneter Start Number:");
		   int end = sc.nextInt(); 
		
		do
		{  
		   System.out.println(start);
		   
		   start++;
		}
		while (start<=end);	
	}
}
