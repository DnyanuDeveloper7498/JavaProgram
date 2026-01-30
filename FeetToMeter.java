
import java.util.Scanner;

class FeetToMeter 
{
	public static void main(String[] args) 
	{
	
	   Scanner sc =new Scanner(System.in);
	   
	   System.out.println("Enter a value for feet:");
	   
	   double feet = sc.nextDouble();
	   
	   
	   double meter = feet * 0.305;
	   		
		System.out.printf("%.1f Feet is %.4f  meters \n ",feet,meter);
	}
}
