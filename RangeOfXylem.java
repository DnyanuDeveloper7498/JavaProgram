import java.util.Scanner;
class RangeOfXylem 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a start:");
		int start =sc.nextInt();
		
		System.out.println("Enter a end:");
		int end =sc.nextInt();
		
		
		while (start<=end)
		{
			int num =start;
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
			System.out.println(start);
		}
		
			start++;
		}
		
	}
}
