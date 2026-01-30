class NarrowingChar 
{
	public static void main(String[] args) 
	{
		
		 char ch1= (char)65; // A (int)
		 
		 System.out.println(ch1);
         		
	     char ch2= (char) 150l;  
		 System.out.println(ch2);  // ? (long)
		 
		 char ch3=(char)45.12f;
		 System.out.println(ch3); // - (float)
		
		 
		 char ch4=(char)88.25;   
		 System.out.println(ch4); // X (double)
 
	}
}
