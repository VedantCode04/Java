class test{
	//fibonacci [1.4]
	public static void main(String[] args){
		int a = 0, b = 1, c;
		
		System.out.println("Vedant Patel IU2141230208");
     		System.out.println("-------------------------");
		
		for (int i = 0; i < 10; ++i)
		{
			System.out.print(a + " ");
			c = a+b;
			a = b;
			b = c;
		}
	}
}
