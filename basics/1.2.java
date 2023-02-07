class main {
    // prime or not [1.2]
    public static void main(String[] args)
    {
        System.out.println("Vedant Patel IU2141230208");
        System.out.println("-------------------------");

        int a = 11, temp = 0;

        for (int i = 2; i < a / 2; ++i) {
            if (a % i == 0) {
                temp++;
            }
        }

        if (temp == 0) {
            System.out.println(a + " is prime");
        } else {
            System.out.println(a + " not prime");
        }
    }
}
