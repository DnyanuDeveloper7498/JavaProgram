
import java.util.Scanner;


class Cylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a radius:-");
		double radius = sc.nextDouble();
		
		System.out.print("Enter a height:-");
		double height = sc.nextDouble();
		
		final double PI = 3.14159;
			
		final double  AREA =PI * radius * radius;
		
		final double VOLUME = AREA* height;
		
		System.out.printf("The Area is:- %.4f \n" , AREA);
		
	    System.out.printf("The Volume is:- %.1f \n" , VOLUME);
		
		
	

	}
}
