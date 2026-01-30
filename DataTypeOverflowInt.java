class DataTypeOverflowInt 
{
	public static void main(String[] args) 
	{
		
        
   int i1 = (int)4294967296l;
   System.out.println(i1); //0
   
   int i2 = (int)4294967295l;// -1
   System.out.println(i2);
   
    int i3 = (int)8589934592l; // 0
    System.out.println(i3);
    
    int i4 = (int)8589934593l;// 1
    System.out.println(i4);
    
    int i5 = (int)8589934591l;// 0
    System.out.println(i5);
	

	    
	}
}
