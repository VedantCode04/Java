class test {
    // max of three TERNARY operator [1.3.1]
    public static void main(String[] args)
    {
        
        System.out.println("Vedant Patel IU2141230208");
        System.out.println("-------------------------");
        
        int a = 30, b = 22, c = 13, d;
        d = ((a > b && a > c) ? a : ((b > a && b > c) ? b : c));

        System.out.println(d + " is greater");
    }
}
