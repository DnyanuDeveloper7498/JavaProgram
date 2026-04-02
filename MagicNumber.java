class MagicNumber
{
	public static void main(String[]args)
	{
		System.out.println(isMagic(226));
	}

    public static boolean isMagic(int num)
    {
    	int sum=sumOfDigit(num);

    	while(sum>9)
    	{
    		sum=sumOfDigit(sum);
    	}

    	return sum==1;
    }



	public static int sumOfDigit(int num)
	{
		int sum=0;
		while(num!=0)
		{
			sum+=num%10;
			num/=10;
		}
		return sum;
	}

}