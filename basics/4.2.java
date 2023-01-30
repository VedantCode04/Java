import java.util.*;
//4.2
class employee {
    Scanner s = new Scanner(System.in);
    int code;
    double base_pay;
    String name, designation;

    employee()
    {
        System.out.print("Enter name: ");
        name = s.nextLine();
        System.out.print("Enter designation: ");
        designation = s.nextLine();

        System.out.print("Enter code: ");
        code = s.nextInt();        
        System.out.print("Enter base pay: ");
        base_pay = s.nextDouble();
    }

    void display()
    {
        System.out.println("name is: " + name);
        System.out.println("code is: " + code);
        System.out.println("salary is: " + base_pay);
        System.out.println("designation is: " + designation);
    }

    void calc(){
        double result;
        double hra = 0.1*base_pay;
        double da = 0.45*base_pay;
        System.out.println("For employee: "+name);
        System.out.println("hra: "+hra);
        System.out.println("da: "+da);
        result = base_pay + hra + da;
        System.out.println("Final pay of "+name+" is: "+result);
    }
}

class main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        employee e = new employee();
        employee e1 = new employee();
        employee e2 = new employee();

        e.calc();
        e1.calc();
        e2.calc();
    }
}
