import java.util.*;
//java program for matrix  multiplication
class matrix {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = 2;
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[n][n];
        int k;
        System.out.println("enter value in matrix a: ");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                a[i][j] = s.nextInt();
            }
        }

        System.out.println("enter value in matrix b: ");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                b[i][j] = s.nextInt();
            }
        }

        System.out.println("matrix c: ");
        for (int i = 0; i < n; ++i) {

            for (int j = 0; j < n; ++j) {
                k = 0;
                c[i][j] = a[i][k] * b[k][j] + a[i][++k] * b[k][j];

                System.out.print(c[i][j] + " ");
            }

            System.out.println();
        }
    }
}
