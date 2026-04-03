class SumOfDigit
{
	public static void main(String[]args)
	{
		System.out.println(sumDigit(12345,0));
	}

	public static int sumDigit(int num,int sum)
	{
		return num==0? sum:sumDigit(num/10,sum+(num%10));
	}
}