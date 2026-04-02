
import java.util.Scanner;

class CheckUniqueNum 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Num:");
		int num=new Scanner(System.in).nextInt();
		
		 if (isUnique(num))
		 {
			 System.out.println("Yes Number is Unique");
		 }
		 else
		{
			 System.out.println("Number is Not Unique");
		}
	}
	
	
	public static boolean isUnique(int num)
	{
		while (num!=0)
		{
			int last=num%10;
			num/=10;
			int temp=num;
			
			while (temp!=0)
			{
				if (last==temp%10)
				{
					return false;
				}
				temp/=10;
			}
		}
		  return true;
	}
}
