
class Population 
{
	public static void main(String[] args) 
	{
	
	       long currPop = 312032486;
		        
				            //  day  hr  min sec   year
		   
			  long seconds = (365 *24* 60 * 60) * 5 ;
		   
		   
		   final Long BIRTH = seconds / 7;
		   
		   final Long DEATH = seconds/13;
			   
		   final Long  IMMIGRANTS =seconds /45;
		   
		   
		   long newPop = currPop + BIRTH - DEATH + IMMIGRANTS;
		   
		   
		   System.out.println("Previous Pop :- " + currPop);
		   
		   System.out.println("New Pop : " + newPop);
		
		
	}
}







