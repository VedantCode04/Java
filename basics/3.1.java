import java.util.Scanner;

class test {
    // replace sub-string with given sub-string
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter string: ");
        String z, y, x;
        z = s.nextLine();
        System.out.println("enter substring you want the replace: ");
        x = s.nextLine();
        System.out.println("enter substring you want to enter: ");
        y = s.nextLine();

        z = z.replace(x, y);

        System.out.println("new string is: " + z);
    }
}
