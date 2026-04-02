// print all rotation and nTh number of ratation
// only change loop 

import java.util.Scanner;
class  RotateNum
{
	public static void main(String[] args) 
	{
	    System.out.println("Enter a Number:");
		int num = new Scanner(System.in).nextInt();
		
		 System.out.println("Enter a yout rotade:");
		int choise = new Scanner(System.in).nextInt();
		
		
		rotated(num,choise);
		
	}
	
	public static void rotated(int num ,int choise)
	{
		int rot=0;
		int ct = count(num);
		int pow =power(10,ct-1);
		int temp=num;
		for (int i=0;i<=choise ;i++ ) //   ratation print give all number
		                              // use only infinight loop while  
		{
		
			int last =num%10;
			num/=10;
			rot=(last*pow)+num;
			
			System.out.println(rot);
			
			if (rot==temp)
			{
				break;
			}
			
		    num= rot;
		
		}
	}
	
	
	public static int count(int num)
	{
		int ct=0;
		while(num!=0)
		{
			num/=10;
			ct++;
		}
		return ct;	
	}
	
	public static int power(int base,int raise)
	{
		int pow=1;
		while (raise>0)
		{
			pow*=base;
			raise--;
		}
		
		return pow;
	}
	
}
