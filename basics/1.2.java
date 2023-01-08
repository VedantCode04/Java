class test{
	//prime or not [1.2]
	public static void main(String[] args){
		int a = 11, temp = 0;

		for (int i = 1; i < a/2 ; ++i ) {
			if (a%i == 0) {
				temp++;
			}
		}

		if (temp == 1) {
			System.out.println("is prime");
		} else {
			System.out.println("not prime");
		}
	}
}
