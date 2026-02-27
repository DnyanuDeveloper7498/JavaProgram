import java.util.Scanner;

class BinaryToDecimal 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
	     System.out.print("Enter a Num");
		 int num =sc.nextInt();
		 
		 int mul=1;
		 int dec=0;
		 
		 while (num>0)
		 {
			 int rem = num%10;
			 
			  dec= mul*rem+dec;    
			 
			 mul*=2;
			 num/=10;
		 }
	   System.out.println(dec);
	}
}
