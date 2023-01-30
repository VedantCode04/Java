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

        System.out.print("Enter name: ");
        p.name = s.nextLine();
        System.out.print("Enter age: ");
        p.age = s.nextInt();
        System.out.print("Enter salary: ");
        p.salary = s.nextInt();

        System.out.println("name is: "+p.name);
        System.out.println("age is: "+p.age);
        System.out.println("salary is: "+p.salary);
    }
}
