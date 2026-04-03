class CountDigit
{
	public static void main(String[]args)
	{
		System.out.println(count(123566,0));
	}

	public static int count(int num,int ct)
	{
		return num==0? ct :count(num/10,ct+1);
	}
}