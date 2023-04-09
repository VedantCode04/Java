import java.util.Scanner;


class NoMatchException extends Exception {
	NoMatchException(){
		super("String is not equal to INDIA ");
	}
}

class main {
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	System.out.println("\nVEDANT PATEL IU2141230208\n");
    	String s;
    	System.out.println("Enter String: ");
    	s = input.nextLine();

    	try {
    		check(s);
    	} catch (NoMatchException e) {
    		System.out.println(e);
    	}
    }

    static void check(String s ) throws NoMatchException {
    		if (s.equalsIgnoreCase("India") == false ) {
    			throw new NoMatchException();
    		}
    }
}
