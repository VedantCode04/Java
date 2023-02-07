class test {
    // max of three IF-ELSE laddr operator [1.3.1]
    public static void main(String[] args)
    {
        int a = 100, b = 200, c = 300;
        
        System.out.println("Vedant Patel IU2141230208");
        System.out.println("-------------------------");
        
        if (a > b) {
            if (a > b) {
                System.out.println(a + " is greater");
            } else if (a < c) {
                System.out.println(c + " is greater");
            }
        } else if (b > a) {
            if (b > c) {
                System.out.println(b + " is greater");
            } else if (c > b) {
                System.out.println(c + " is greater");
            }
        }
    }
}
