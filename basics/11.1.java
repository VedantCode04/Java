import java.util.*;

public class main {
    public static void main(String[] args)
    {
    	System.out.println("\nVEDANT PATEL IU2141230208\n");
        Stack<String> stack = new Stack<>();

        stack.push("Vedant");
        stack.push("P");
        stack.push("Patel");

        System.out.print("STACK = ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.print("VECTOR = ");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
        }

        System.out.println();

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("java");
        arrayList.add("dsa");
        arrayList.add("os");

        System.out.print("ARRAYLIST = ");
        for (String str : arrayList) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
