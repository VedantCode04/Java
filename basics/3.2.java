import java.util.Scanner;

class test {
    // sort string 3.2
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter string: ");
        char[] arr = s.next().toCharArray();
        char temp;

        int length = arr.length;
        for (int i = 0; i < length - 1; ++i) {
            for (int j = 0; j < length - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) { // check the char using ascii value
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted string is: ");
        for (char a : arr) {
            System.out.print(a);
        }
        System.out.println();
    }
}
