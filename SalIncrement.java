 /* Employee ki salary ₹25,000 per month hai.
 Har saal 10% increment milta hai.
 Java program likho jo next 5 years ki salary print kare.*/  


class SalIncrement 
{
   public static void main(String [] args )
   
{
   
      double sal = 25000;
 
      double increment =10;


     for( int i=1;i<=5;i++)
{
 
     sal = sal + (sal *increment /100);

  System.out.println(" Sal " + i + "Year: " + sal);
     
}


}

}

