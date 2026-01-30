class DataTypeOverflowShort 
{
	public static void main(String[] args) 
	{
		short s1= (short)65536;
		System.out.println(s1); // 0
		
		short s2 = (short)65500;
		System.out.println(s2); // -36
		
		short s3 = (short)65535;
		System.out.println(s3); // -1
		
		short s4 = (short)65537;
		System.out.println(s4); // 1
		
		short s5 = (short)131072;
		System.out.println(s5); // 0
		
		short s6 = (short)131071;
		System.out.println(s6); // -1
	}
}
