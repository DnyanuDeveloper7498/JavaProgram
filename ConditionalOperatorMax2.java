class ConditionalOperatorMax2
{
	public static void main(String[] args) 
	{
		int num1=951,num2=5006,num3=6,num4=5585;
		
		/*int ans = num1> num2?num1:num2;
		int result =ans>num3?ans:num3;*/
		
		//int largest = num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
		
		// int  largest = (num1>num2?num1:num2)>num3?( num1>num2 ? num1:num2) : num3;
		
		 
		/*int large;
		 
		int largest = num1 >(large=num2>num3?num2:num3)? (large>num1?large:num1):(large>num4?large:num4);*/
		
		
		
		 int large;
		 int largest = num1 >(large = num2>num3?num2:num3)?(large>num1? large:num1):(large>num4?large:num4);
		System.out.println(largest);
		
		
	}
}
