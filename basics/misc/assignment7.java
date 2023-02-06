import java.util.Scanner;
class students {
    Scanner s = new Scanner(System.in);
    int id, n_sub;
    int s_code[] = new int[10];
    int credits[] = new int[10];
    int grade[] = new int[10];
    float Spi;
    students()
    {
        System.out.println("Enter student id: ");
        id = s.nextInt();
        System.out.println("Enter subject enrolled: ");
        n_sub = s.nextInt();
        System.out.println("Enter sub code: ");
        for (int i = 0; i < n_sub; ++i) {
            System.out.println("Enter code, credits and grade for " + (i + 1));
            s_code[i] = s.nextInt();
            credits[i] = s.nextInt();
            grade[i] = s.nextInt();
        }
    }
    void calculate()
    {
        float sum = 0;
        float totalCredits = 0;
        for (int i = 0; i < n_sub; ++i) {
            sum = (credits[i] * grade[i]) + sum;
            totalCredits = credits[i] + totalCredits;
        }
        Spi = sum / totalCredits;
        System.out.println("SPI is " + Spi);
    }
}
class hello {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        students[] obj;
        obj = new students[n];
    }
}
for (int i = 0; i < n; ++i) {
    obj[i] = new students();
    obj[i].calculate();
}
