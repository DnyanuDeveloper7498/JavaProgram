class SortDigit
{
	public static void main(String[]args)
	{
         System.out.println(sortDigit(324125));
         frequncy(4562);
         System.out.println("max Num:"+maxDigit(1956));

         System.out.println("min Num:"+minDigit(44326));

          System.out.println("sec Num:"+secMax(45626));


	}

	public static int sortDigit(int num)
	{
		 int ans=0;
		 for(int i=1;i<=9;i++)
		 {
		 	for(int j=num;j!=0;j/=10)
		 	{
		 		if(j%10==i)
		 		{
		 			ans=ans*10+j%10;
		 		}
		 	}
		   
		 }
		 return ans;
	}


	public static void frequncy(int num)
	{
	     for(int i=0;i<=9;i++)
	     {
	     	int ct=0;
	     	int temp=num;
	     	while(temp!=0)
	     	{
	     	    if(temp%10==i)
	     	    {
	     	    	ct++;
	     	    }
	     	   temp/=10;
	     	}

              if(ct>0)
              {
	     	 System.out.println(i+" "+ct);
	     	  }

	     }



	}



	public static int maxDigit(int num)
	{
		int max=0;

          while(num!=0)
          {
              if(num%10>max)
              {
              	max=num%10;
              }
              num/=10;
          }
          return max;
	}


	public static int minDigit(int num)
	{
		int min=9;
		while(num!=0)
		{
			if(num%10<min)
			{
				min=num%10;
			}
			num/=10;
		}
		return min;
	}

	public static int secMax(int num)
	{
		int max=0,secMax=0;

		while(num!=0)
		{
			int last=num%10;
			if(last>max)
			{
				secMax=max;
				max=last;
			}
			else  if(last>secMax && last!=max)
			{
                 secMax=last;
			}
			num/=10;
		}
		return secMax;
	}
}