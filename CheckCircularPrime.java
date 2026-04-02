
import java.util.Scanner;

class CheckCircularPrime 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number:");
		int num = new Scanner(System.in).nextInt();
		
		if (isPrime(num))
		{
		
	   if (isPrime(rotated(num)))
	   {
		   System.out.println("Yes CircularPrime ");
	   }
	    else 
		{
			System.out.println("Not CircularePrime");
		}
	 }
	  else 
		{
			System.out.println("Not CircularePrime");
		}
	}
	
	public static int rotated(int num)
	{
		
		
		return num%10 *power(10,count(num)-1)+num/10;
	      
	}
	
	
	
	public static int count(int num)
	{
		int ct=0;
		while (num!=0)
		{
			num/=10;
			ct++;
		}
		return ct;
	}
	
	public static int power(int base, int raise)
	{
		int pow=1;
		while (raise>0)
		{
			pow*=base;
			raise--;
		}
		return pow;
	}
	
  public static boolean isPrime(int num)
	{
	  int den=2;
	   
	    while (den<num)
	    {
			if (num%den==0)
			{
				break;
			}
			den++;
	    }
		return den==num;
	}
}
