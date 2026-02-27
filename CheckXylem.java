import java.util.Scanner;
class CheckXylem 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a num:");
		int num =sc.nextInt();
		int sumOfEnd=num%10;
		     num/=10;
	    int sumOfMid =0;
		
		while(num>9)
		{
			sumOfMid+= (num%10);
			num/=10;
		}
		sumOfEnd +=num;
		
		if (sumOfEnd==sumOfMid)
		{
			System.out.println("xylem Number");
		}
		else 
		{
			System.out.println(" Phloem Number ");
		}
	}
}
