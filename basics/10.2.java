import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("\nVEDANT PATEL IU2141230208\n");

        Random random = new Random();
        int[] numbers = new int[10]; 
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100);
        }

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("rand.dat"))) {
            for (int number : numbers) {
                dos.writeInt(number);
            }
            System.out.println("Random integers written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("rand.dat"))) {
            System.out.println("Reading random integers from file:");
            for (int i = 0; i < numbers.length; i++) {
                int number = dis.readInt();
                System.out.println(number);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
