
// table Print any number using While Loop

import java.util.Scanner;

class TablePrint 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Eneter Print table:");
		int num = sc.nextInt();
		
		int n=1;
		
		while (n<=10)
		{
			System.out.println(n +" * "+ num+" = "+num*n);
			n++;
		}
	}
}
