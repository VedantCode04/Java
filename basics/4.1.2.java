import java.util.*;
//4.1.2
class person {
    Scanner s = new Scanner(System.in);
    int age, salary;
    String name;

    person()
    {
        System.out.print("Enter name: ");
        name = s.nextLine();
        System.out.print("Enter age: ");
        age = s.nextInt();
        System.out.print("Enter salary: ");
        salary = s.nextInt();
    }

    void display()
    {
        System.out.println("name is: " + name);
        System.out.println("age is: " + age);
        System.out.println("salary is: " + salary);
    }
}

class main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        person p = new person();
        p.display();
    }
}
