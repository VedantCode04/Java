import java.util.*;
//4.1.1
class person{
    int age, salary;
    String name;
}

class main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        person p = new person();

        System.out.println("Vedant Patel IU2141230208");
        System.out.println("-------------------------");

        System.out.print("Enter name: ");
        p.name = s.nextLine();
        System.out.print("Enter age: ");
        p.age = s.nextInt();
        System.out.print("Enter salary: ");
        p.salary = s.nextInt();

        System.out.println("\nDisplaying the contents of the object: \n");
        System.out.println("Person name:"+p.name);
        System.out.println("Person age:"+p.age);
        System.out.println("Person salary:"+p.salary);
    }
}
