class ConditionalOperatorMax
{
	public static void main(String[] args) 
	{
		int num1=95550,num2=50000000,num3=6000000;
		
		/*int ans = num1> num2?num1:num2;
		int result =ans>num3?ans:num3;*/
		
		//int largest = num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
		
		// int  largest = (num1>num2?num1:num2)>num3?( num1>num2 ? num1:num2) : num3;
		
		 
		int large;
		 
		int largest = (num1 >(large=num2>num3? num2:num3))? (num1>num2? num1:num2) :(num2>num3? num2:num3);
	
		System.out.println(largest);
		
		
	}
}
