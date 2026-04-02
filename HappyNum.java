class HappyNum 
{
	public static void main(String[] args) 
	{
		System.out.println(isHappy(5));
	}
	
	public static boolean isHappy(int num)
	{
	    int sum=sumSqDigit(num);
		
		while (sum!=1 && sum!=4)
		{
			sum=sumSqDigit(sum);
		}
		
		return sum==1;
	}
	public static int sumSqDigit(int num)
	{
		int sum=0;
		while (num!=0)
		{
			int last=num%10;
			sum=sum+(last*last);
			num/=10;
		}
		return sum;
	}
}
