class PalindromeLeed 
{
	public static void main(String[]args)
	{
        System.out.println(palindrome(-121));
	}

	public static String palindrome(int num)
	{
		String str=num+"";
		String revers="";

		 for(int i=0;i<str.length();i++)
		 {
		 	revers=str.charAt(i)+revers;
		 }

		

          
		return str.trim().equals(revers.trim());
	}
}