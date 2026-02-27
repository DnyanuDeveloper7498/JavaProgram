class  RightTringle
{
	public static void main(String[] args) 
	{
		
		int n =5;
		
		int totalLine=2*n-1, currentLine=1,  star=n-5 ;
		
	   
	   while (currentLine <=totalLine)
	   {
		  
		  
		    for (int i=1;i<=star;i++ )
		    {
				System.out.print("* ");
		    }
		   
		    System.out.println();
		   
		     
			 if(currentLine<n)
		    {
				
				star++; 
		    }
		    else 
		    { 
			    star--;	
		    }
		   
			  	   
		     currentLine++;
		   
	   }
	    
		
	}
}
