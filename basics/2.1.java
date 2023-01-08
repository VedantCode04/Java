import java.util.Scanner;

class test {
    // avg of array 2.1
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter array size ");
        int size;
        float sum = 0;
        size = s.nextInt();

        int arr[] = new int[size];

        System.out.println("enter array elements ");

        for (int i = 0; i < size; ++i) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }

        System.out.println("avg is " + (sum / size));
    }
}
