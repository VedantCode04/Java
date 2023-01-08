class test{
	//fibonacci [1.4]
	public static void main(String[] args){
		int a = 0, b = 1, c;

		for (int i = 0; i < 10; ++i)
		{
			System.out.println(a);
			c = a+b;
			a = b;
			b = c;
		}
	}
}
