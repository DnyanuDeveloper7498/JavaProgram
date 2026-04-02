class PascalTringle 
{
	public static void main(String[] args) 
	{
		
		pascalTringle(4);
	}
	
	
	public static void pascalTringle(int n)
	{
		
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n-1-i ; j++)
			{
				System.out.print(" "+" ");
			}
			
			for (int j=0;j<=i ;j++ )
			{
				System.out.print(nCr(i,j)+"   ");
			}
			
			System.out.println();
		}
	}
	
	
	
	
	public static int nCr(int n,int r)
	{
		return factorial(n)/( factorial(r)*factorial(n-r));
	}
	
	public static int factorial(int num)
	{
		int fact=1;
		while (num>1)
		{
			fact*=num;
			num--;
		}
		return fact;
	}
}
