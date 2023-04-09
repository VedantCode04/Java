class main {
    public static void main(String[] args)
    {
        System.out.println("\nVEDANT PATEL IU2141230208\n");
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("a/b = " + c);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("ArrayIndexOutOfBoundsException: \nOnly One argument is passed. Please Enter again");
        } catch (ArithmeticException ae) {
            System.out.println("ARITHMETIC EXCEPTION: \nDivision by Zero not Possible ");
        }
    }
}
