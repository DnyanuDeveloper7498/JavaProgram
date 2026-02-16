class Demo
{
	public static void main(String[] args) 
	{
		
	   int n =5;
	   int totalLine=n;
	   int currentLine=1;
	   int star = n;
	 
	   
       while (currentLine<=totalLine)
       {
		   
		   for (int column=1;column<=3;column++ )
		   {
			   System.out.print("*");
			  
		   }
	    
		   //nextLine preparation 
		   
		     System.out.println();
		   
		   currentLine++;
       }
	   
	}
}
